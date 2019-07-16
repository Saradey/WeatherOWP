package io.realm;


import android.annotation.TargetApi;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;
import io.realm.ProxyUtils;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Property;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.android.JsonUtils;
import io.realm.log.RealmLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings("all")
public class com_example_weatherowpandroid_model_MainRealmProxy extends com.example.weatherowpandroid.model.Main
    implements RealmObjectProxy, com_example_weatherowpandroid_model_MainRealmProxyInterface {

    static final class MainColumnInfo extends ColumnInfo {
        long tempIndex;
        long pressureIndex;
        long seaLevelIndex;
        long grndLevelIndex;
        long humidityIndex;
        long tempKfIndex;

        MainColumnInfo(OsSchemaInfo schemaInfo) {
            super(6);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Main");
            this.tempIndex = addColumnDetails("temp", "temp", objectSchemaInfo);
            this.pressureIndex = addColumnDetails("pressure", "pressure", objectSchemaInfo);
            this.seaLevelIndex = addColumnDetails("seaLevel", "seaLevel", objectSchemaInfo);
            this.grndLevelIndex = addColumnDetails("grndLevel", "grndLevel", objectSchemaInfo);
            this.humidityIndex = addColumnDetails("humidity", "humidity", objectSchemaInfo);
            this.tempKfIndex = addColumnDetails("tempKf", "tempKf", objectSchemaInfo);
        }

        MainColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new MainColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final MainColumnInfo src = (MainColumnInfo) rawSrc;
            final MainColumnInfo dst = (MainColumnInfo) rawDst;
            dst.tempIndex = src.tempIndex;
            dst.pressureIndex = src.pressureIndex;
            dst.seaLevelIndex = src.seaLevelIndex;
            dst.grndLevelIndex = src.grndLevelIndex;
            dst.humidityIndex = src.humidityIndex;
            dst.tempKfIndex = src.tempKfIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private MainColumnInfo columnInfo;
    private ProxyState<com.example.weatherowpandroid.model.Main> proxyState;

    com_example_weatherowpandroid_model_MainRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (MainColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.example.weatherowpandroid.model.Main>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public Float realmGet$temp() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.tempIndex)) {
            return null;
        }
        return (float) proxyState.getRow$realm().getFloat(columnInfo.tempIndex);
    }

    @Override
    public void realmSet$temp(Float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.tempIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setFloat(columnInfo.tempIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.tempIndex);
            return;
        }
        proxyState.getRow$realm().setFloat(columnInfo.tempIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Float realmGet$pressure() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.pressureIndex)) {
            return null;
        }
        return (float) proxyState.getRow$realm().getFloat(columnInfo.pressureIndex);
    }

    @Override
    public void realmSet$pressure(Float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.pressureIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setFloat(columnInfo.pressureIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.pressureIndex);
            return;
        }
        proxyState.getRow$realm().setFloat(columnInfo.pressureIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Float realmGet$seaLevel() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.seaLevelIndex)) {
            return null;
        }
        return (float) proxyState.getRow$realm().getFloat(columnInfo.seaLevelIndex);
    }

    @Override
    public void realmSet$seaLevel(Float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.seaLevelIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setFloat(columnInfo.seaLevelIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.seaLevelIndex);
            return;
        }
        proxyState.getRow$realm().setFloat(columnInfo.seaLevelIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Float realmGet$grndLevel() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.grndLevelIndex)) {
            return null;
        }
        return (float) proxyState.getRow$realm().getFloat(columnInfo.grndLevelIndex);
    }

    @Override
    public void realmSet$grndLevel(Float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.grndLevelIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setFloat(columnInfo.grndLevelIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.grndLevelIndex);
            return;
        }
        proxyState.getRow$realm().setFloat(columnInfo.grndLevelIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$humidity() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.humidityIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.humidityIndex);
    }

    @Override
    public void realmSet$humidity(Integer value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.humidityIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.humidityIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.humidityIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.humidityIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Float realmGet$tempKf() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.tempKfIndex)) {
            return null;
        }
        return (float) proxyState.getRow$realm().getFloat(columnInfo.tempKfIndex);
    }

    @Override
    public void realmSet$tempKf(Float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.tempKfIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setFloat(columnInfo.tempKfIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.tempKfIndex);
            return;
        }
        proxyState.getRow$realm().setFloat(columnInfo.tempKfIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Main", 6, 0);
        builder.addPersistedProperty("temp", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("pressure", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("seaLevel", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("grndLevel", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("humidity", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("tempKf", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static MainColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new MainColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Main";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Main";
    }

    @SuppressWarnings("cast")
    public static com.example.weatherowpandroid.model.Main createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.example.weatherowpandroid.model.Main obj = realm.createObjectInternal(com.example.weatherowpandroid.model.Main.class, true, excludeFields);

        final com_example_weatherowpandroid_model_MainRealmProxyInterface objProxy = (com_example_weatherowpandroid_model_MainRealmProxyInterface) obj;
        if (json.has("temp")) {
            if (json.isNull("temp")) {
                objProxy.realmSet$temp(null);
            } else {
                objProxy.realmSet$temp((float) json.getDouble("temp"));
            }
        }
        if (json.has("pressure")) {
            if (json.isNull("pressure")) {
                objProxy.realmSet$pressure(null);
            } else {
                objProxy.realmSet$pressure((float) json.getDouble("pressure"));
            }
        }
        if (json.has("seaLevel")) {
            if (json.isNull("seaLevel")) {
                objProxy.realmSet$seaLevel(null);
            } else {
                objProxy.realmSet$seaLevel((float) json.getDouble("seaLevel"));
            }
        }
        if (json.has("grndLevel")) {
            if (json.isNull("grndLevel")) {
                objProxy.realmSet$grndLevel(null);
            } else {
                objProxy.realmSet$grndLevel((float) json.getDouble("grndLevel"));
            }
        }
        if (json.has("humidity")) {
            if (json.isNull("humidity")) {
                objProxy.realmSet$humidity(null);
            } else {
                objProxy.realmSet$humidity((int) json.getInt("humidity"));
            }
        }
        if (json.has("tempKf")) {
            if (json.isNull("tempKf")) {
                objProxy.realmSet$tempKf(null);
            } else {
                objProxy.realmSet$tempKf((float) json.getDouble("tempKf"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.example.weatherowpandroid.model.Main createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.example.weatherowpandroid.model.Main obj = new com.example.weatherowpandroid.model.Main();
        final com_example_weatherowpandroid_model_MainRealmProxyInterface objProxy = (com_example_weatherowpandroid_model_MainRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("temp")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$temp((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$temp(null);
                }
            } else if (name.equals("pressure")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$pressure((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$pressure(null);
                }
            } else if (name.equals("seaLevel")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$seaLevel((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$seaLevel(null);
                }
            } else if (name.equals("grndLevel")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$grndLevel((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$grndLevel(null);
                }
            } else if (name.equals("humidity")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$humidity((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$humidity(null);
                }
            } else if (name.equals("tempKf")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tempKf((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$tempKf(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    public static com.example.weatherowpandroid.model.Main copyOrUpdate(Realm realm, com.example.weatherowpandroid.model.Main object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null) {
            final BaseRealm otherRealm = ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm();
            if (otherRealm.threadId != realm.threadId) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if (otherRealm.getPath().equals(realm.getPath())) {
                return object;
            }
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (com.example.weatherowpandroid.model.Main) cachedRealmObject;
        }

        return copy(realm, object, update, cache);
    }

    public static com.example.weatherowpandroid.model.Main copy(Realm realm, com.example.weatherowpandroid.model.Main newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.example.weatherowpandroid.model.Main) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.example.weatherowpandroid.model.Main realmObject = realm.createObjectInternal(com.example.weatherowpandroid.model.Main.class, false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        com_example_weatherowpandroid_model_MainRealmProxyInterface realmObjectSource = (com_example_weatherowpandroid_model_MainRealmProxyInterface) newObject;
        com_example_weatherowpandroid_model_MainRealmProxyInterface realmObjectCopy = (com_example_weatherowpandroid_model_MainRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$temp(realmObjectSource.realmGet$temp());
        realmObjectCopy.realmSet$pressure(realmObjectSource.realmGet$pressure());
        realmObjectCopy.realmSet$seaLevel(realmObjectSource.realmGet$seaLevel());
        realmObjectCopy.realmSet$grndLevel(realmObjectSource.realmGet$grndLevel());
        realmObjectCopy.realmSet$humidity(realmObjectSource.realmGet$humidity());
        realmObjectCopy.realmSet$tempKf(realmObjectSource.realmGet$tempKf());
        return realmObject;
    }

    public static long insert(Realm realm, com.example.weatherowpandroid.model.Main object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.example.weatherowpandroid.model.Main.class);
        long tableNativePtr = table.getNativePtr();
        MainColumnInfo columnInfo = (MainColumnInfo) realm.getSchema().getColumnInfo(com.example.weatherowpandroid.model.Main.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        Float realmGet$temp = ((com_example_weatherowpandroid_model_MainRealmProxyInterface) object).realmGet$temp();
        if (realmGet$temp != null) {
            Table.nativeSetFloat(tableNativePtr, columnInfo.tempIndex, rowIndex, realmGet$temp, false);
        }
        Float realmGet$pressure = ((com_example_weatherowpandroid_model_MainRealmProxyInterface) object).realmGet$pressure();
        if (realmGet$pressure != null) {
            Table.nativeSetFloat(tableNativePtr, columnInfo.pressureIndex, rowIndex, realmGet$pressure, false);
        }
        Float realmGet$seaLevel = ((com_example_weatherowpandroid_model_MainRealmProxyInterface) object).realmGet$seaLevel();
        if (realmGet$seaLevel != null) {
            Table.nativeSetFloat(tableNativePtr, columnInfo.seaLevelIndex, rowIndex, realmGet$seaLevel, false);
        }
        Float realmGet$grndLevel = ((com_example_weatherowpandroid_model_MainRealmProxyInterface) object).realmGet$grndLevel();
        if (realmGet$grndLevel != null) {
            Table.nativeSetFloat(tableNativePtr, columnInfo.grndLevelIndex, rowIndex, realmGet$grndLevel, false);
        }
        Number realmGet$humidity = ((com_example_weatherowpandroid_model_MainRealmProxyInterface) object).realmGet$humidity();
        if (realmGet$humidity != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.humidityIndex, rowIndex, realmGet$humidity.longValue(), false);
        }
        Float realmGet$tempKf = ((com_example_weatherowpandroid_model_MainRealmProxyInterface) object).realmGet$tempKf();
        if (realmGet$tempKf != null) {
            Table.nativeSetFloat(tableNativePtr, columnInfo.tempKfIndex, rowIndex, realmGet$tempKf, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.example.weatherowpandroid.model.Main.class);
        long tableNativePtr = table.getNativePtr();
        MainColumnInfo columnInfo = (MainColumnInfo) realm.getSchema().getColumnInfo(com.example.weatherowpandroid.model.Main.class);
        com.example.weatherowpandroid.model.Main object = null;
        while (objects.hasNext()) {
            object = (com.example.weatherowpandroid.model.Main) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            Float realmGet$temp = ((com_example_weatherowpandroid_model_MainRealmProxyInterface) object).realmGet$temp();
            if (realmGet$temp != null) {
                Table.nativeSetFloat(tableNativePtr, columnInfo.tempIndex, rowIndex, realmGet$temp, false);
            }
            Float realmGet$pressure = ((com_example_weatherowpandroid_model_MainRealmProxyInterface) object).realmGet$pressure();
            if (realmGet$pressure != null) {
                Table.nativeSetFloat(tableNativePtr, columnInfo.pressureIndex, rowIndex, realmGet$pressure, false);
            }
            Float realmGet$seaLevel = ((com_example_weatherowpandroid_model_MainRealmProxyInterface) object).realmGet$seaLevel();
            if (realmGet$seaLevel != null) {
                Table.nativeSetFloat(tableNativePtr, columnInfo.seaLevelIndex, rowIndex, realmGet$seaLevel, false);
            }
            Float realmGet$grndLevel = ((com_example_weatherowpandroid_model_MainRealmProxyInterface) object).realmGet$grndLevel();
            if (realmGet$grndLevel != null) {
                Table.nativeSetFloat(tableNativePtr, columnInfo.grndLevelIndex, rowIndex, realmGet$grndLevel, false);
            }
            Number realmGet$humidity = ((com_example_weatherowpandroid_model_MainRealmProxyInterface) object).realmGet$humidity();
            if (realmGet$humidity != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.humidityIndex, rowIndex, realmGet$humidity.longValue(), false);
            }
            Float realmGet$tempKf = ((com_example_weatherowpandroid_model_MainRealmProxyInterface) object).realmGet$tempKf();
            if (realmGet$tempKf != null) {
                Table.nativeSetFloat(tableNativePtr, columnInfo.tempKfIndex, rowIndex, realmGet$tempKf, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.example.weatherowpandroid.model.Main object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.example.weatherowpandroid.model.Main.class);
        long tableNativePtr = table.getNativePtr();
        MainColumnInfo columnInfo = (MainColumnInfo) realm.getSchema().getColumnInfo(com.example.weatherowpandroid.model.Main.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        Float realmGet$temp = ((com_example_weatherowpandroid_model_MainRealmProxyInterface) object).realmGet$temp();
        if (realmGet$temp != null) {
            Table.nativeSetFloat(tableNativePtr, columnInfo.tempIndex, rowIndex, realmGet$temp, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.tempIndex, rowIndex, false);
        }
        Float realmGet$pressure = ((com_example_weatherowpandroid_model_MainRealmProxyInterface) object).realmGet$pressure();
        if (realmGet$pressure != null) {
            Table.nativeSetFloat(tableNativePtr, columnInfo.pressureIndex, rowIndex, realmGet$pressure, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.pressureIndex, rowIndex, false);
        }
        Float realmGet$seaLevel = ((com_example_weatherowpandroid_model_MainRealmProxyInterface) object).realmGet$seaLevel();
        if (realmGet$seaLevel != null) {
            Table.nativeSetFloat(tableNativePtr, columnInfo.seaLevelIndex, rowIndex, realmGet$seaLevel, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.seaLevelIndex, rowIndex, false);
        }
        Float realmGet$grndLevel = ((com_example_weatherowpandroid_model_MainRealmProxyInterface) object).realmGet$grndLevel();
        if (realmGet$grndLevel != null) {
            Table.nativeSetFloat(tableNativePtr, columnInfo.grndLevelIndex, rowIndex, realmGet$grndLevel, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.grndLevelIndex, rowIndex, false);
        }
        Number realmGet$humidity = ((com_example_weatherowpandroid_model_MainRealmProxyInterface) object).realmGet$humidity();
        if (realmGet$humidity != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.humidityIndex, rowIndex, realmGet$humidity.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.humidityIndex, rowIndex, false);
        }
        Float realmGet$tempKf = ((com_example_weatherowpandroid_model_MainRealmProxyInterface) object).realmGet$tempKf();
        if (realmGet$tempKf != null) {
            Table.nativeSetFloat(tableNativePtr, columnInfo.tempKfIndex, rowIndex, realmGet$tempKf, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.tempKfIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.example.weatherowpandroid.model.Main.class);
        long tableNativePtr = table.getNativePtr();
        MainColumnInfo columnInfo = (MainColumnInfo) realm.getSchema().getColumnInfo(com.example.weatherowpandroid.model.Main.class);
        com.example.weatherowpandroid.model.Main object = null;
        while (objects.hasNext()) {
            object = (com.example.weatherowpandroid.model.Main) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            Float realmGet$temp = ((com_example_weatherowpandroid_model_MainRealmProxyInterface) object).realmGet$temp();
            if (realmGet$temp != null) {
                Table.nativeSetFloat(tableNativePtr, columnInfo.tempIndex, rowIndex, realmGet$temp, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.tempIndex, rowIndex, false);
            }
            Float realmGet$pressure = ((com_example_weatherowpandroid_model_MainRealmProxyInterface) object).realmGet$pressure();
            if (realmGet$pressure != null) {
                Table.nativeSetFloat(tableNativePtr, columnInfo.pressureIndex, rowIndex, realmGet$pressure, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.pressureIndex, rowIndex, false);
            }
            Float realmGet$seaLevel = ((com_example_weatherowpandroid_model_MainRealmProxyInterface) object).realmGet$seaLevel();
            if (realmGet$seaLevel != null) {
                Table.nativeSetFloat(tableNativePtr, columnInfo.seaLevelIndex, rowIndex, realmGet$seaLevel, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.seaLevelIndex, rowIndex, false);
            }
            Float realmGet$grndLevel = ((com_example_weatherowpandroid_model_MainRealmProxyInterface) object).realmGet$grndLevel();
            if (realmGet$grndLevel != null) {
                Table.nativeSetFloat(tableNativePtr, columnInfo.grndLevelIndex, rowIndex, realmGet$grndLevel, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.grndLevelIndex, rowIndex, false);
            }
            Number realmGet$humidity = ((com_example_weatherowpandroid_model_MainRealmProxyInterface) object).realmGet$humidity();
            if (realmGet$humidity != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.humidityIndex, rowIndex, realmGet$humidity.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.humidityIndex, rowIndex, false);
            }
            Float realmGet$tempKf = ((com_example_weatherowpandroid_model_MainRealmProxyInterface) object).realmGet$tempKf();
            if (realmGet$tempKf != null) {
                Table.nativeSetFloat(tableNativePtr, columnInfo.tempKfIndex, rowIndex, realmGet$tempKf, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.tempKfIndex, rowIndex, false);
            }
        }
    }

    public static com.example.weatherowpandroid.model.Main createDetachedCopy(com.example.weatherowpandroid.model.Main realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.example.weatherowpandroid.model.Main unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.example.weatherowpandroid.model.Main();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.example.weatherowpandroid.model.Main) cachedObject.object;
            }
            unmanagedObject = (com.example.weatherowpandroid.model.Main) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_example_weatherowpandroid_model_MainRealmProxyInterface unmanagedCopy = (com_example_weatherowpandroid_model_MainRealmProxyInterface) unmanagedObject;
        com_example_weatherowpandroid_model_MainRealmProxyInterface realmSource = (com_example_weatherowpandroid_model_MainRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$temp(realmSource.realmGet$temp());
        unmanagedCopy.realmSet$pressure(realmSource.realmGet$pressure());
        unmanagedCopy.realmSet$seaLevel(realmSource.realmGet$seaLevel());
        unmanagedCopy.realmSet$grndLevel(realmSource.realmGet$grndLevel());
        unmanagedCopy.realmSet$humidity(realmSource.realmGet$humidity());
        unmanagedCopy.realmSet$tempKf(realmSource.realmGet$tempKf());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Main = proxy[");
        stringBuilder.append("{temp:");
        stringBuilder.append(realmGet$temp() != null ? realmGet$temp() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{pressure:");
        stringBuilder.append(realmGet$pressure() != null ? realmGet$pressure() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{seaLevel:");
        stringBuilder.append(realmGet$seaLevel() != null ? realmGet$seaLevel() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{grndLevel:");
        stringBuilder.append(realmGet$grndLevel() != null ? realmGet$grndLevel() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{humidity:");
        stringBuilder.append(realmGet$humidity() != null ? realmGet$humidity() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tempKf:");
        stringBuilder.append(realmGet$tempKf() != null ? realmGet$tempKf() : "null");
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

    @Override
    public int hashCode() {
        String realmName = proxyState.getRealm$realm().getPath();
        String tableName = proxyState.getRow$realm().getTable().getName();
        long rowIndex = proxyState.getRow$realm().getIndex();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (rowIndex ^ (rowIndex >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com_example_weatherowpandroid_model_MainRealmProxy aMain = (com_example_weatherowpandroid_model_MainRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aMain.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aMain.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aMain.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
