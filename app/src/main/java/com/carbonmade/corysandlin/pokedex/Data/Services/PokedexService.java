package com.carbonmade.corysandlin.pokedex.Data.Services;

import com.carbonmade.corysandlin.pokedex.Data.Storage.AppDatabase;

import retrofit2.Retrofit;

public class PokedexService {
    public final BerriesService berries;
    public final ContestsService contests;
    public final EncountersService encounters;
    public final EvolutionsService evolutions;
    public final GamesService games;
    public final ItemsService items;
    public final MachinesService machines;
    public final MovesService moves;
    public final LocationsService locations;
    public final PokemonService pokemon;
    public final UtilitiesService utilities;

    public PokedexService(Retrofit retrofit, AppDatabase database) {
        berries = new BerriesService(retrofit);
        contests = new ContestsService(retrofit);
        encounters = new EncountersService(retrofit);
        evolutions = new EvolutionsService(retrofit);
        games = new GamesService(retrofit);
        items = new ItemsService(retrofit);
        machines = new MachinesService(retrofit);
        moves = new MovesService(retrofit);
        locations = new LocationsService(retrofit);
        pokemon = new PokemonService(retrofit, database);
        utilities = new UtilitiesService(retrofit);
    }
}
