package com.carbonmade.corysandlin.pokedex.Data.Services;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResourceList;
import com.carbonmade.corysandlin.pokedex.Data.Models.Moves.Move;
import com.carbonmade.corysandlin.pokedex.Data.Models.Moves.MoveAilment;
import com.carbonmade.corysandlin.pokedex.Data.Models.Moves.MoveBattleStyle;
import com.carbonmade.corysandlin.pokedex.Data.Models.Moves.MoveCategory;
import com.carbonmade.corysandlin.pokedex.Data.Models.Moves.MoveDamageClass;
import com.carbonmade.corysandlin.pokedex.Data.Models.Moves.MoveLearnMethod;
import com.carbonmade.corysandlin.pokedex.Data.Models.Moves.MoveTarget;
import com.carbonmade.corysandlin.pokedex.Data.Network.MovesApi;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;

public class MovesService {
    private Retrofit mRetrofit;

    MovesService(Retrofit retrofit) {
        mRetrofit = retrofit;
    }

    public void getMoves(Callback<NamedApiResourceList> callback) {
        Call<NamedApiResourceList> moves = mRetrofit.create(MovesApi.class).getMoves();
        moves.enqueue(callback);
    }

    public void getMove(int id, Callback<Move> callback) {
        Call<Move> move = mRetrofit.create(MovesApi.class).getMove(id);
        move.enqueue(callback);
    }

    public void getMove(String name, Callback<Move> callback) {
        Call<Move> move = mRetrofit.create(MovesApi.class).getMove(name);
        move.enqueue(callback);
    }

    public void getMoveAilments(Callback<NamedApiResourceList> callback) {
        Call<NamedApiResourceList> ailments = mRetrofit.create(MovesApi.class).getMoveAilments();
        ailments.enqueue(callback);
    }

    public void getMoveAilment(int id, Callback<MoveAilment> callback) {
        Call<MoveAilment> move = mRetrofit.create(MovesApi.class).getMoveAilment(id);
        move.enqueue(callback);
    }

    public void getMoveAilment(String name, Callback<MoveAilment> callback) {
        Call<MoveAilment> move = mRetrofit.create(MovesApi.class).getMoveAilment(name);
        move.enqueue(callback);
    }

    public void getMoveBattleStyles(Callback<NamedApiResourceList> callback) {
        Call<NamedApiResourceList> styles = mRetrofit.create(MovesApi.class).getMoveBattleStyles();
        styles.enqueue(callback);
    }

    public void getMoveBattleStyle(int id, Callback<MoveBattleStyle> callback) {
        Call<MoveBattleStyle> move = mRetrofit.create(MovesApi.class).getMoveBattleStyle(id);
        move.enqueue(callback);
    }

    public void getMoveBattleStyle(String name, Callback<MoveBattleStyle> callback) {
        Call<MoveBattleStyle> move = mRetrofit.create(MovesApi.class).getMoveBattleStyle(name);
        move.enqueue(callback);
    }

    public void getMoveCategories(Callback<NamedApiResourceList> callback) {
        Call<NamedApiResourceList> categories = mRetrofit.create(MovesApi.class).getMoveCategories();
        categories.enqueue(callback);
    }

    public void getMoveCategory(int id, Callback<MoveCategory> callback) {
        Call<MoveCategory> move = mRetrofit.create(MovesApi.class).getMoveCategory(id);
        move.enqueue(callback);
    }

    public void getMoveCategory(String name, Callback<MoveCategory> callback) {
        Call<MoveCategory> move = mRetrofit.create(MovesApi.class).getMoveCategory(name);
        move.enqueue(callback);
    }

    public void getMoveDamageClasses(Callback<NamedApiResourceList> callback) {
        Call<NamedApiResourceList> classes = mRetrofit.create(MovesApi.class).getMoveDamageClasses();
        classes.enqueue(callback);
    }

    public void getMoveDamageClass(int id, Callback<MoveDamageClass> callback) {
        Call<MoveDamageClass> move = mRetrofit.create(MovesApi.class).getMoveDamageClass(id);
        move.enqueue(callback);
    }

    public void getMoveDamageClass(String name, Callback<MoveDamageClass> callback) {
        Call<MoveDamageClass> move = mRetrofit.create(MovesApi.class).getMoveDamageClass(name);
        move.enqueue(callback);
    }

    public void getMoveLearnMethods(Callback<NamedApiResourceList> callback) {
        Call<NamedApiResourceList> methods = mRetrofit.create(MovesApi.class).getMoveLearnMethods();
        methods.enqueue(callback);
    }

    public void getMoveLearnMethod(int id, Callback<MoveLearnMethod> callback) {
        Call<MoveLearnMethod> move = mRetrofit.create(MovesApi.class).getMoveLearnMethod(id);
        move.enqueue(callback);
    }

    public void getMoveLearnMethod(String name, Callback<MoveLearnMethod> callback) {
        Call<MoveLearnMethod> move = mRetrofit.create(MovesApi.class).getMoveLearnMethod(name);
        move.enqueue(callback);
    }

    public void getMoveTargets(Callback<NamedApiResourceList> callback) {
        Call<NamedApiResourceList> targets = mRetrofit.create(MovesApi.class).getMoveTargets();
        targets.enqueue(callback);
    }

    public void getMoveTarget(int id, Callback<MoveTarget> callback) {
        Call<MoveTarget> move = mRetrofit.create(MovesApi.class).getMoveTarget(id);
        move.enqueue(callback);
    }

    public void getMoveTarget(String name, Callback<MoveTarget> callback) {
        Call<MoveTarget> move = mRetrofit.create(MovesApi.class).getMoveTarget(name);
        move.enqueue(callback);
    }
}
