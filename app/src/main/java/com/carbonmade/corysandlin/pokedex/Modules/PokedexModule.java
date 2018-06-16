package com.carbonmade.corysandlin.pokedex.Modules;

import android.app.Application;
import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.migration.Migration;

import com.carbonmade.corysandlin.pokedex.Data.Services.PokedexService;
import com.carbonmade.corysandlin.pokedex.Data.Storage.AppDatabase;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@Module
public class PokedexModule {
    public PokedexModule() {

    }

    @Provides
    @Singleton
    @Inject
    PokedexService providePokedex(Retrofit retrofit, AppDatabase database) {
        return new PokedexService(retrofit, database);
    }

    @Provides
    @Singleton
    @Inject
    AppDatabase provideDatabase(Application app) {
        final Migration MIGRATION_1_2 = new Migration(1, 2) {
            @Override
            public void migrate(SupportSQLiteDatabase database) {
                database.execSQL("DROP TABLE `NamedApiResourceList`");
            }
        };

        return Room.databaseBuilder(
                app.getApplicationContext(),
                AppDatabase.class,
                "pokedex")
            .addMigrations(MIGRATION_1_2)
            .build();
    }
}
