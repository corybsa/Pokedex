package com.carbonmade.corysandlin.pokedex.Data.Network;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResourceList;
import com.carbonmade.corysandlin.pokedex.Data.Models.Moves.Move;
import com.carbonmade.corysandlin.pokedex.Data.Models.Moves.MoveAilment;
import com.carbonmade.corysandlin.pokedex.Data.Models.Moves.MoveBattleStyle;
import com.carbonmade.corysandlin.pokedex.Data.Models.Moves.MoveCategory;
import com.carbonmade.corysandlin.pokedex.Data.Models.Moves.MoveDamageClass;
import com.carbonmade.corysandlin.pokedex.Data.Models.Moves.MoveLearnMethod;
import com.carbonmade.corysandlin.pokedex.Data.Models.Moves.MoveTarget;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface MovesApi {
    @GET("move")
    Call<NamedApiResourceList> getMoves();

    @GET("move/{id}")
    Call<Move> getMove(@Path("id") int id);

    @GET("move/{name}")
    Call<Move> getMove(@Path("name") String name);

    @GET("move-ailment")
    Call<NamedApiResourceList> getMoveAilments();

    @GET("move-ailment/{id}")
    Call<MoveAilment> getMoveAilment(@Path("id") int id);

    @GET("move-ailment/{name}")
    Call<MoveAilment> getMoveAilment(@Path("name") String name);

    @GET("move-battle-style")
    Call<NamedApiResourceList> getMoveBattleStyles();

    @GET("move-battle-style/{id}")
    Call<MoveBattleStyle> getMoveBattleStyle(@Path("id") int id);

    @GET("move-battle-style/{name}")
    Call<MoveBattleStyle> getMoveBattleStyle(@Path("name") String name);

    @GET("move-category")
    Call<NamedApiResourceList> getMoveCategories();

    @GET("move-category/{id}")
    Call<MoveCategory> getMoveCategory(@Path("id") int id);

    @GET("move-category/{name}")
    Call<MoveCategory> getMoveCategory(@Path("name") String name);

    @GET("move-damage-class")
    Call<NamedApiResourceList> getMoveDamageClasses();

    @GET("move-damage-class/{id}")
    Call<MoveDamageClass> getMoveDamageClass(@Path("id") int id);

    @GET("move-damage-class/{name}")
    Call<MoveDamageClass> getMoveDamageClass(@Path("name") String name);

    @GET("move-learn-method")
    Call<NamedApiResourceList> getMoveLearnMethods();

    @GET("move-learn-method/{id}")
    Call<MoveLearnMethod> getMoveLearnMethod(@Path("id") int id);

    @GET("move-learn-method/{name}")
    Call<MoveLearnMethod> getMoveLearnMethod(@Path("name") String name);

    @GET("move-target")
    Call<NamedApiResourceList> getMoveTargets();

    @GET("move-target/{id}")
    Call<MoveTarget> getMoveTarget(@Path("id") int id);

    @GET("move-target/{name}")
    Call<MoveTarget> getMoveTarget(@Path("name") String name);
}
