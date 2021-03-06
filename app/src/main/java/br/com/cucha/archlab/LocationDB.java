package br.com.cucha.archlab;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverters;

/**
 * Created by eduardo on 10/4/17.
 */

@Database(entities = { LocationInfo.class }, version = 2)
@TypeConverters({ DBTypeConverters.class })
public abstract class LocationDB extends RoomDatabase {
    public abstract LocationInfoDAO locationInfoDAO();
}
