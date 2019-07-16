package io.realm;


import android.util.JsonReader;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.RealmProxyMediator;
import io.realm.internal.Row;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

@io.realm.annotations.RealmModule
class DefaultRealmModuleMediator extends RealmProxyMediator {

    private static final Set<Class<? extends RealmModel>> MODEL_CLASSES;
    static {
        Set<Class<? extends RealmModel>> modelClasses = new HashSet<Class<? extends RealmModel>>(7);
        modelClasses.add(com.example.weatherowpandroid.model.ListWeathers.class);
        modelClasses.add(com.example.weatherowpandroid.model.Wind.class);
        modelClasses.add(com.example.weatherowpandroid.model.FullResponseListWeathers.class);
        modelClasses.add(com.example.weatherowpandroid.model.Weather.class);
        modelClasses.add(com.example.weatherowpandroid.model.Clouds.class);
        modelClasses.add(com.example.weatherowpandroid.model.Main.class);
        modelClasses.add(com.example.weatherowpandroid.model.Sys.class);
        MODEL_CLASSES = Collections.unmodifiableSet(modelClasses);
    }

    @Override
    public Map<Class<? extends RealmModel>, OsObjectSchemaInfo> getExpectedObjectSchemaInfoMap() {
        Map<Class<? extends RealmModel>, OsObjectSchemaInfo> infoMap = new HashMap<Class<? extends RealmModel>, OsObjectSchemaInfo>(7);
        infoMap.put(com.example.weatherowpandroid.model.ListWeathers.class, io.realm.com_example_weatherowpandroid_model_ListWeathersRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.example.weatherowpandroid.model.Wind.class, io.realm.com_example_weatherowpandroid_model_WindRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.example.weatherowpandroid.model.FullResponseListWeathers.class, io.realm.com_example_weatherowpandroid_model_FullResponseListWeathersRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.example.weatherowpandroid.model.Weather.class, io.realm.com_example_weatherowpandroid_model_WeatherRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.example.weatherowpandroid.model.Clouds.class, io.realm.com_example_weatherowpandroid_model_CloudsRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.example.weatherowpandroid.model.Main.class, io.realm.com_example_weatherowpandroid_model_MainRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.example.weatherowpandroid.model.Sys.class, io.realm.com_example_weatherowpandroid_model_SysRealmProxy.getExpectedObjectSchemaInfo());
        return infoMap;
    }

    @Override
    public ColumnInfo createColumnInfo(Class<? extends RealmModel> clazz, OsSchemaInfo schemaInfo) {
        checkClass(clazz);

        if (clazz.equals(com.example.weatherowpandroid.model.ListWeathers.class)) {
            return io.realm.com_example_weatherowpandroid_model_ListWeathersRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.example.weatherowpandroid.model.Wind.class)) {
            return io.realm.com_example_weatherowpandroid_model_WindRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.example.weatherowpandroid.model.FullResponseListWeathers.class)) {
            return io.realm.com_example_weatherowpandroid_model_FullResponseListWeathersRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.example.weatherowpandroid.model.Weather.class)) {
            return io.realm.com_example_weatherowpandroid_model_WeatherRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.example.weatherowpandroid.model.Clouds.class)) {
            return io.realm.com_example_weatherowpandroid_model_CloudsRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.example.weatherowpandroid.model.Main.class)) {
            return io.realm.com_example_weatherowpandroid_model_MainRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.example.weatherowpandroid.model.Sys.class)) {
            return io.realm.com_example_weatherowpandroid_model_SysRealmProxy.createColumnInfo(schemaInfo);
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public String getSimpleClassNameImpl(Class<? extends RealmModel> clazz) {
        checkClass(clazz);

        if (clazz.equals(com.example.weatherowpandroid.model.ListWeathers.class)) {
            return "ListWeathers";
        }
        if (clazz.equals(com.example.weatherowpandroid.model.Wind.class)) {
            return "Wind";
        }
        if (clazz.equals(com.example.weatherowpandroid.model.FullResponseListWeathers.class)) {
            return "FullResponseListWeathers";
        }
        if (clazz.equals(com.example.weatherowpandroid.model.Weather.class)) {
            return "Weather";
        }
        if (clazz.equals(com.example.weatherowpandroid.model.Clouds.class)) {
            return "Clouds";
        }
        if (clazz.equals(com.example.weatherowpandroid.model.Main.class)) {
            return "Main";
        }
        if (clazz.equals(com.example.weatherowpandroid.model.Sys.class)) {
            return "Sys";
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E newInstance(Class<E> clazz, Object baseRealm, Row row, ColumnInfo columnInfo, boolean acceptDefaultValue, List<String> excludeFields) {
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        try {
            objectContext.set((BaseRealm) baseRealm, row, columnInfo, acceptDefaultValue, excludeFields);
            checkClass(clazz);

            if (clazz.equals(com.example.weatherowpandroid.model.ListWeathers.class)) {
                return clazz.cast(new io.realm.com_example_weatherowpandroid_model_ListWeathersRealmProxy());
            }
            if (clazz.equals(com.example.weatherowpandroid.model.Wind.class)) {
                return clazz.cast(new io.realm.com_example_weatherowpandroid_model_WindRealmProxy());
            }
            if (clazz.equals(com.example.weatherowpandroid.model.FullResponseListWeathers.class)) {
                return clazz.cast(new io.realm.com_example_weatherowpandroid_model_FullResponseListWeathersRealmProxy());
            }
            if (clazz.equals(com.example.weatherowpandroid.model.Weather.class)) {
                return clazz.cast(new io.realm.com_example_weatherowpandroid_model_WeatherRealmProxy());
            }
            if (clazz.equals(com.example.weatherowpandroid.model.Clouds.class)) {
                return clazz.cast(new io.realm.com_example_weatherowpandroid_model_CloudsRealmProxy());
            }
            if (clazz.equals(com.example.weatherowpandroid.model.Main.class)) {
                return clazz.cast(new io.realm.com_example_weatherowpandroid_model_MainRealmProxy());
            }
            if (clazz.equals(com.example.weatherowpandroid.model.Sys.class)) {
                return clazz.cast(new io.realm.com_example_weatherowpandroid_model_SysRealmProxy());
            }
            throw getMissingProxyClassException(clazz);
        } finally {
            objectContext.clear();
        }
    }

    @Override
    public Set<Class<? extends RealmModel>> getModelClasses() {
        return MODEL_CLASSES;
    }

    @Override
    public <E extends RealmModel> E copyOrUpdate(Realm realm, E obj, boolean update, Map<RealmModel, RealmObjectProxy> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) ((obj instanceof RealmObjectProxy) ? obj.getClass().getSuperclass() : obj.getClass());

        if (clazz.equals(com.example.weatherowpandroid.model.ListWeathers.class)) {
            return clazz.cast(io.realm.com_example_weatherowpandroid_model_ListWeathersRealmProxy.copyOrUpdate(realm, (com.example.weatherowpandroid.model.ListWeathers) obj, update, cache));
        }
        if (clazz.equals(com.example.weatherowpandroid.model.Wind.class)) {
            return clazz.cast(io.realm.com_example_weatherowpandroid_model_WindRealmProxy.copyOrUpdate(realm, (com.example.weatherowpandroid.model.Wind) obj, update, cache));
        }
        if (clazz.equals(com.example.weatherowpandroid.model.FullResponseListWeathers.class)) {
            return clazz.cast(io.realm.com_example_weatherowpandroid_model_FullResponseListWeathersRealmProxy.copyOrUpdate(realm, (com.example.weatherowpandroid.model.FullResponseListWeathers) obj, update, cache));
        }
        if (clazz.equals(com.example.weatherowpandroid.model.Weather.class)) {
            return clazz.cast(io.realm.com_example_weatherowpandroid_model_WeatherRealmProxy.copyOrUpdate(realm, (com.example.weatherowpandroid.model.Weather) obj, update, cache));
        }
        if (clazz.equals(com.example.weatherowpandroid.model.Clouds.class)) {
            return clazz.cast(io.realm.com_example_weatherowpandroid_model_CloudsRealmProxy.copyOrUpdate(realm, (com.example.weatherowpandroid.model.Clouds) obj, update, cache));
        }
        if (clazz.equals(com.example.weatherowpandroid.model.Main.class)) {
            return clazz.cast(io.realm.com_example_weatherowpandroid_model_MainRealmProxy.copyOrUpdate(realm, (com.example.weatherowpandroid.model.Main) obj, update, cache));
        }
        if (clazz.equals(com.example.weatherowpandroid.model.Sys.class)) {
            return clazz.cast(io.realm.com_example_weatherowpandroid_model_SysRealmProxy.copyOrUpdate(realm, (com.example.weatherowpandroid.model.Sys) obj, update, cache));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public void insert(Realm realm, RealmModel object, Map<RealmModel, Long> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

        if (clazz.equals(com.example.weatherowpandroid.model.ListWeathers.class)) {
            io.realm.com_example_weatherowpandroid_model_ListWeathersRealmProxy.insert(realm, (com.example.weatherowpandroid.model.ListWeathers) object, cache);
        } else if (clazz.equals(com.example.weatherowpandroid.model.Wind.class)) {
            io.realm.com_example_weatherowpandroid_model_WindRealmProxy.insert(realm, (com.example.weatherowpandroid.model.Wind) object, cache);
        } else if (clazz.equals(com.example.weatherowpandroid.model.FullResponseListWeathers.class)) {
            io.realm.com_example_weatherowpandroid_model_FullResponseListWeathersRealmProxy.insert(realm, (com.example.weatherowpandroid.model.FullResponseListWeathers) object, cache);
        } else if (clazz.equals(com.example.weatherowpandroid.model.Weather.class)) {
            io.realm.com_example_weatherowpandroid_model_WeatherRealmProxy.insert(realm, (com.example.weatherowpandroid.model.Weather) object, cache);
        } else if (clazz.equals(com.example.weatherowpandroid.model.Clouds.class)) {
            io.realm.com_example_weatherowpandroid_model_CloudsRealmProxy.insert(realm, (com.example.weatherowpandroid.model.Clouds) object, cache);
        } else if (clazz.equals(com.example.weatherowpandroid.model.Main.class)) {
            io.realm.com_example_weatherowpandroid_model_MainRealmProxy.insert(realm, (com.example.weatherowpandroid.model.Main) object, cache);
        } else if (clazz.equals(com.example.weatherowpandroid.model.Sys.class)) {
            io.realm.com_example_weatherowpandroid_model_SysRealmProxy.insert(realm, (com.example.weatherowpandroid.model.Sys) object, cache);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public void insert(Realm realm, Collection<? extends RealmModel> objects) {
        Iterator<? extends RealmModel> iterator = objects.iterator();
        RealmModel object = null;
        Map<RealmModel, Long> cache = new HashMap<RealmModel, Long>(objects.size());
        if (iterator.hasNext()) {
            //  access the first element to figure out the clazz for the routing below
            object = iterator.next();
            // This cast is correct because obj is either
            // generated by RealmProxy or the original type extending directly from RealmObject
            @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

            if (clazz.equals(com.example.weatherowpandroid.model.ListWeathers.class)) {
                io.realm.com_example_weatherowpandroid_model_ListWeathersRealmProxy.insert(realm, (com.example.weatherowpandroid.model.ListWeathers) object, cache);
            } else if (clazz.equals(com.example.weatherowpandroid.model.Wind.class)) {
                io.realm.com_example_weatherowpandroid_model_WindRealmProxy.insert(realm, (com.example.weatherowpandroid.model.Wind) object, cache);
            } else if (clazz.equals(com.example.weatherowpandroid.model.FullResponseListWeathers.class)) {
                io.realm.com_example_weatherowpandroid_model_FullResponseListWeathersRealmProxy.insert(realm, (com.example.weatherowpandroid.model.FullResponseListWeathers) object, cache);
            } else if (clazz.equals(com.example.weatherowpandroid.model.Weather.class)) {
                io.realm.com_example_weatherowpandroid_model_WeatherRealmProxy.insert(realm, (com.example.weatherowpandroid.model.Weather) object, cache);
            } else if (clazz.equals(com.example.weatherowpandroid.model.Clouds.class)) {
                io.realm.com_example_weatherowpandroid_model_CloudsRealmProxy.insert(realm, (com.example.weatherowpandroid.model.Clouds) object, cache);
            } else if (clazz.equals(com.example.weatherowpandroid.model.Main.class)) {
                io.realm.com_example_weatherowpandroid_model_MainRealmProxy.insert(realm, (com.example.weatherowpandroid.model.Main) object, cache);
            } else if (clazz.equals(com.example.weatherowpandroid.model.Sys.class)) {
                io.realm.com_example_weatherowpandroid_model_SysRealmProxy.insert(realm, (com.example.weatherowpandroid.model.Sys) object, cache);
            } else {
                throw getMissingProxyClassException(clazz);
            }
            if (iterator.hasNext()) {
                if (clazz.equals(com.example.weatherowpandroid.model.ListWeathers.class)) {
                    io.realm.com_example_weatherowpandroid_model_ListWeathersRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.example.weatherowpandroid.model.Wind.class)) {
                    io.realm.com_example_weatherowpandroid_model_WindRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.example.weatherowpandroid.model.FullResponseListWeathers.class)) {
                    io.realm.com_example_weatherowpandroid_model_FullResponseListWeathersRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.example.weatherowpandroid.model.Weather.class)) {
                    io.realm.com_example_weatherowpandroid_model_WeatherRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.example.weatherowpandroid.model.Clouds.class)) {
                    io.realm.com_example_weatherowpandroid_model_CloudsRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.example.weatherowpandroid.model.Main.class)) {
                    io.realm.com_example_weatherowpandroid_model_MainRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.example.weatherowpandroid.model.Sys.class)) {
                    io.realm.com_example_weatherowpandroid_model_SysRealmProxy.insert(realm, iterator, cache);
                } else {
                    throw getMissingProxyClassException(clazz);
                }
            }
        }
    }

    @Override
    public void insertOrUpdate(Realm realm, RealmModel obj, Map<RealmModel, Long> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((obj instanceof RealmObjectProxy) ? obj.getClass().getSuperclass() : obj.getClass());

        if (clazz.equals(com.example.weatherowpandroid.model.ListWeathers.class)) {
            io.realm.com_example_weatherowpandroid_model_ListWeathersRealmProxy.insertOrUpdate(realm, (com.example.weatherowpandroid.model.ListWeathers) obj, cache);
        } else if (clazz.equals(com.example.weatherowpandroid.model.Wind.class)) {
            io.realm.com_example_weatherowpandroid_model_WindRealmProxy.insertOrUpdate(realm, (com.example.weatherowpandroid.model.Wind) obj, cache);
        } else if (clazz.equals(com.example.weatherowpandroid.model.FullResponseListWeathers.class)) {
            io.realm.com_example_weatherowpandroid_model_FullResponseListWeathersRealmProxy.insertOrUpdate(realm, (com.example.weatherowpandroid.model.FullResponseListWeathers) obj, cache);
        } else if (clazz.equals(com.example.weatherowpandroid.model.Weather.class)) {
            io.realm.com_example_weatherowpandroid_model_WeatherRealmProxy.insertOrUpdate(realm, (com.example.weatherowpandroid.model.Weather) obj, cache);
        } else if (clazz.equals(com.example.weatherowpandroid.model.Clouds.class)) {
            io.realm.com_example_weatherowpandroid_model_CloudsRealmProxy.insertOrUpdate(realm, (com.example.weatherowpandroid.model.Clouds) obj, cache);
        } else if (clazz.equals(com.example.weatherowpandroid.model.Main.class)) {
            io.realm.com_example_weatherowpandroid_model_MainRealmProxy.insertOrUpdate(realm, (com.example.weatherowpandroid.model.Main) obj, cache);
        } else if (clazz.equals(com.example.weatherowpandroid.model.Sys.class)) {
            io.realm.com_example_weatherowpandroid_model_SysRealmProxy.insertOrUpdate(realm, (com.example.weatherowpandroid.model.Sys) obj, cache);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public void insertOrUpdate(Realm realm, Collection<? extends RealmModel> objects) {
        Iterator<? extends RealmModel> iterator = objects.iterator();
        RealmModel object = null;
        Map<RealmModel, Long> cache = new HashMap<RealmModel, Long>(objects.size());
        if (iterator.hasNext()) {
            //  access the first element to figure out the clazz for the routing below
            object = iterator.next();
            // This cast is correct because obj is either
            // generated by RealmProxy or the original type extending directly from RealmObject
            @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

            if (clazz.equals(com.example.weatherowpandroid.model.ListWeathers.class)) {
                io.realm.com_example_weatherowpandroid_model_ListWeathersRealmProxy.insertOrUpdate(realm, (com.example.weatherowpandroid.model.ListWeathers) object, cache);
            } else if (clazz.equals(com.example.weatherowpandroid.model.Wind.class)) {
                io.realm.com_example_weatherowpandroid_model_WindRealmProxy.insertOrUpdate(realm, (com.example.weatherowpandroid.model.Wind) object, cache);
            } else if (clazz.equals(com.example.weatherowpandroid.model.FullResponseListWeathers.class)) {
                io.realm.com_example_weatherowpandroid_model_FullResponseListWeathersRealmProxy.insertOrUpdate(realm, (com.example.weatherowpandroid.model.FullResponseListWeathers) object, cache);
            } else if (clazz.equals(com.example.weatherowpandroid.model.Weather.class)) {
                io.realm.com_example_weatherowpandroid_model_WeatherRealmProxy.insertOrUpdate(realm, (com.example.weatherowpandroid.model.Weather) object, cache);
            } else if (clazz.equals(com.example.weatherowpandroid.model.Clouds.class)) {
                io.realm.com_example_weatherowpandroid_model_CloudsRealmProxy.insertOrUpdate(realm, (com.example.weatherowpandroid.model.Clouds) object, cache);
            } else if (clazz.equals(com.example.weatherowpandroid.model.Main.class)) {
                io.realm.com_example_weatherowpandroid_model_MainRealmProxy.insertOrUpdate(realm, (com.example.weatherowpandroid.model.Main) object, cache);
            } else if (clazz.equals(com.example.weatherowpandroid.model.Sys.class)) {
                io.realm.com_example_weatherowpandroid_model_SysRealmProxy.insertOrUpdate(realm, (com.example.weatherowpandroid.model.Sys) object, cache);
            } else {
                throw getMissingProxyClassException(clazz);
            }
            if (iterator.hasNext()) {
                if (clazz.equals(com.example.weatherowpandroid.model.ListWeathers.class)) {
                    io.realm.com_example_weatherowpandroid_model_ListWeathersRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.example.weatherowpandroid.model.Wind.class)) {
                    io.realm.com_example_weatherowpandroid_model_WindRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.example.weatherowpandroid.model.FullResponseListWeathers.class)) {
                    io.realm.com_example_weatherowpandroid_model_FullResponseListWeathersRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.example.weatherowpandroid.model.Weather.class)) {
                    io.realm.com_example_weatherowpandroid_model_WeatherRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.example.weatherowpandroid.model.Clouds.class)) {
                    io.realm.com_example_weatherowpandroid_model_CloudsRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.example.weatherowpandroid.model.Main.class)) {
                    io.realm.com_example_weatherowpandroid_model_MainRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.example.weatherowpandroid.model.Sys.class)) {
                    io.realm.com_example_weatherowpandroid_model_SysRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else {
                    throw getMissingProxyClassException(clazz);
                }
            }
        }
    }

    @Override
    public <E extends RealmModel> E createOrUpdateUsingJsonObject(Class<E> clazz, Realm realm, JSONObject json, boolean update)
        throws JSONException {
        checkClass(clazz);

        if (clazz.equals(com.example.weatherowpandroid.model.ListWeathers.class)) {
            return clazz.cast(io.realm.com_example_weatherowpandroid_model_ListWeathersRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.example.weatherowpandroid.model.Wind.class)) {
            return clazz.cast(io.realm.com_example_weatherowpandroid_model_WindRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.example.weatherowpandroid.model.FullResponseListWeathers.class)) {
            return clazz.cast(io.realm.com_example_weatherowpandroid_model_FullResponseListWeathersRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.example.weatherowpandroid.model.Weather.class)) {
            return clazz.cast(io.realm.com_example_weatherowpandroid_model_WeatherRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.example.weatherowpandroid.model.Clouds.class)) {
            return clazz.cast(io.realm.com_example_weatherowpandroid_model_CloudsRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.example.weatherowpandroid.model.Main.class)) {
            return clazz.cast(io.realm.com_example_weatherowpandroid_model_MainRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.example.weatherowpandroid.model.Sys.class)) {
            return clazz.cast(io.realm.com_example_weatherowpandroid_model_SysRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E createUsingJsonStream(Class<E> clazz, Realm realm, JsonReader reader)
        throws IOException {
        checkClass(clazz);

        if (clazz.equals(com.example.weatherowpandroid.model.ListWeathers.class)) {
            return clazz.cast(io.realm.com_example_weatherowpandroid_model_ListWeathersRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.example.weatherowpandroid.model.Wind.class)) {
            return clazz.cast(io.realm.com_example_weatherowpandroid_model_WindRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.example.weatherowpandroid.model.FullResponseListWeathers.class)) {
            return clazz.cast(io.realm.com_example_weatherowpandroid_model_FullResponseListWeathersRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.example.weatherowpandroid.model.Weather.class)) {
            return clazz.cast(io.realm.com_example_weatherowpandroid_model_WeatherRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.example.weatherowpandroid.model.Clouds.class)) {
            return clazz.cast(io.realm.com_example_weatherowpandroid_model_CloudsRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.example.weatherowpandroid.model.Main.class)) {
            return clazz.cast(io.realm.com_example_weatherowpandroid_model_MainRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.example.weatherowpandroid.model.Sys.class)) {
            return clazz.cast(io.realm.com_example_weatherowpandroid_model_SysRealmProxy.createUsingJsonStream(realm, reader));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E createDetachedCopy(E realmObject, int maxDepth, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) realmObject.getClass().getSuperclass();

        if (clazz.equals(com.example.weatherowpandroid.model.ListWeathers.class)) {
            return clazz.cast(io.realm.com_example_weatherowpandroid_model_ListWeathersRealmProxy.createDetachedCopy((com.example.weatherowpandroid.model.ListWeathers) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.example.weatherowpandroid.model.Wind.class)) {
            return clazz.cast(io.realm.com_example_weatherowpandroid_model_WindRealmProxy.createDetachedCopy((com.example.weatherowpandroid.model.Wind) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.example.weatherowpandroid.model.FullResponseListWeathers.class)) {
            return clazz.cast(io.realm.com_example_weatherowpandroid_model_FullResponseListWeathersRealmProxy.createDetachedCopy((com.example.weatherowpandroid.model.FullResponseListWeathers) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.example.weatherowpandroid.model.Weather.class)) {
            return clazz.cast(io.realm.com_example_weatherowpandroid_model_WeatherRealmProxy.createDetachedCopy((com.example.weatherowpandroid.model.Weather) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.example.weatherowpandroid.model.Clouds.class)) {
            return clazz.cast(io.realm.com_example_weatherowpandroid_model_CloudsRealmProxy.createDetachedCopy((com.example.weatherowpandroid.model.Clouds) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.example.weatherowpandroid.model.Main.class)) {
            return clazz.cast(io.realm.com_example_weatherowpandroid_model_MainRealmProxy.createDetachedCopy((com.example.weatherowpandroid.model.Main) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.example.weatherowpandroid.model.Sys.class)) {
            return clazz.cast(io.realm.com_example_weatherowpandroid_model_SysRealmProxy.createDetachedCopy((com.example.weatherowpandroid.model.Sys) realmObject, 0, maxDepth, cache));
        }
        throw getMissingProxyClassException(clazz);
    }

}
