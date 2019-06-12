package com.vijju.hannu.myjavamvvmarchitecture;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

@Database(entities = {LocationData.class}, version = 1,exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {

    private static AppDatabase mINSTANCE;

    public abstract LocationDataDao locationDataDao();

    public static AppDatabase getAppDatabase(Context context) {
        if (mINSTANCE == null) {
            mINSTANCE =
                    Room.databaseBuilder(context.getApplicationContext(), AppDatabase.class, "hannu-database")
                            .allowMainThreadQueries()
                            .build();
        }
        return mINSTANCE;
    }

    public static void destroyInstance() {
        mINSTANCE = null;
    }
}

