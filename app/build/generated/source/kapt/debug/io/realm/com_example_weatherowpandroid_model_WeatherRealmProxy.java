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
public class com_example_weatherowpandroid_model_WeatherRealmProxy extends com.example.weatherowpandroid.model.Weather
    implements RealmObjectProxy, com_example_weatherowpandroid_model_WeatherRealmProxyInterface {

    static final class WeatherColumnInfo extends ColumnInfo {
        long idIndex;
        long mainIndex;
        long descriptionIndex;
        long iconIndex;

        WeatherColumnInfo(OsSchemaInfo schemaInfo) {
            super(4);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Weather");
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.mainIndex = addColumnDetails("main", "main", objectSchemaInfo);
            this.descriptionIndex = addColumnDetails("description", "description", objectSchemaInfo);
            this.iconIndex = addColumnDetails("icon", "icon", objectSchemaInfo);
        }

        WeatherColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new WeatherColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final WeatherColumnInfo src = (WeatherColumnInfo) rawSrc;
            final WeatherColumnInfo dst = (WeatherColumnInfo) rawDst;
            dst.idIndex = src.idIndex;
            dst.mainIndex = src.mainIndex;
            dst.descriptionIndex = src.descriptionIndex;
            dst.iconIndex = src.iconIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private WeatherColumnInfo columnInfo;
    private ProxyState<com.example.weatherowpandroid.model.Weather> proxyState;

    com_example_weatherowpandroid_model_WeatherRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (WeatherColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.example.weatherowpandroid.model.Weather>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$id() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.idIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.idIndex);
    }

    @Override
    public void realmSet$id(Integer value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.idIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.idIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.idIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.idIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$main() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.mainIndex);
    }

    @Override
    public void realmSet$main(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.mainIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.mainIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.mainIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.mainIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$description() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.descriptionIndex);
    }

    @Override
    public void realmSet$description(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.descriptionIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.descriptionIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.descriptionIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.descriptionIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$icon() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.iconIndex);
    }

    @Override
    public void realmSet$icon(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.iconIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.iconIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.iconIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.iconIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Weather", 4, 0);
        builder.addPersistedProperty("id", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("main", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("description", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("icon", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static WeatherColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new WeatherColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Weather";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Weather";
    }

    @SuppressWarnings("cast")
    public static com.example.weatherowpandroid.model.Weather createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.example.weatherowpandroid.model.Weather obj = realm.createObjectInternal(com.example.weatherowpandroid.model.Weather.class, true, excludeFields);

        final com_example_weatherowpandroid_model_WeatherRealmProxyInterface objProxy = (com_example_weatherowpandroid_model_WeatherRealmProxyInterface) obj;
        if (json.has("id")) {
            if (json.isNull("id")) {
                objProxy.realmSet$id(null);
            } else {
                objProxy.realmSet$id((int) json.getInt("id"));
            }
        }
        if (json.has("main")) {
            if (json.isNull("main")) {
                objProxy.realmSet$main(null);
            } else {
                objProxy.realmSet$main((String) json.getString("main"));
            }
        }
        if (json.has("description")) {
            if (json.isNull("description")) {
                objProxy.realmSet$description(null);
            } else {
                objProxy.realmSet$description((String) json.getString("description"));
            }
        }
        if (json.has("icon")) {
            if (json.isNull("icon")) {
                objProxy.realmSet$icon(null);
            } else {
                objProxy.realmSet$icon((String) json.getString("icon"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.example.weatherowpandroid.model.Weather createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.example.weatherowpandroid.model.Weather obj = new com.example.weatherowpandroid.model.Weather();
        final com_example_weatherowpandroid_model_WeatherRealmProxyInterface objProxy = (com_example_weatherowpandroid_model_WeatherRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("id")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$id((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$id(null);
                }
            } else if (name.equals("main")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$main((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$main(null);
                }
            } else if (name.equals("description")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$description((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$description(null);
                }
            } else if (name.equals("icon")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$icon((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$icon(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    public static com.example.weatherowpandroid.model.Weather copyOrUpdate(Realm realm, com.example.weatherowpandroid.model.Weather object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
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
            return (com.example.weatherowpandroid.model.Weather) cachedRealmObject;
        }

        return copy(realm, object, update, cache);
    }

    public static com.example.weatherowpandroid.model.Weather copy(Realm realm, com.example.weatherowpandroid.model.Weather newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.example.weatherowpandroid.model.Weather) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.example.weatherowpandroid.model.Weather realmObject = realm.createObjectInternal(com.example.weatherowpandroid.model.Weather.class, false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        com_example_weatherowpandroid_model_WeatherRealmProxyInterface realmObjectSource = (com_example_weatherowpandroid_model_WeatherRealmProxyInterface) newObject;
        com_example_weatherowpandroid_model_WeatherRealmProxyInterface realmObjectCopy = (com_example_weatherowpandroid_model_WeatherRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$id(realmObjectSource.realmGet$id());
        realmObjectCopy.realmSet$main(realmObjectSource.realmGet$main());
        realmObjectCopy.realmSet$description(realmObjectSource.realmGet$description());
        realmObjectCopy.realmSet$icon(realmObjectSource.realmGet$icon());
        return realmObject;
    }

    public static long insert(Realm realm, com.example.weatherowpandroid.model.Weather object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.example.weatherowpandroid.model.Weather.class);
        long tableNativePtr = table.getNativePtr();
        WeatherColumnInfo columnInfo = (WeatherColumnInfo) realm.getSchema().getColumnInfo(com.example.weatherowpandroid.model.Weather.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        Number realmGet$id = ((com_example_weatherowpandroid_model_WeatherRealmProxyInterface) object).realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.idIndex, rowIndex, realmGet$id.longValue(), false);
        }
        String realmGet$main = ((com_example_weatherowpandroid_model_WeatherRealmProxyInterface) object).realmGet$main();
        if (realmGet$main != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.mainIndex, rowIndex, realmGet$main, false);
        }
        String realmGet$description = ((com_example_weatherowpandroid_model_WeatherRealmProxyInterface) object).realmGet$description();
        if (realmGet$description != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.descriptionIndex, rowIndex, realmGet$description, false);
        }
        String realmGet$icon = ((com_example_weatherowpandroid_model_WeatherRealmProxyInterface) object).realmGet$icon();
        if (realmGet$icon != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.iconIndex, rowIndex, realmGet$icon, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.example.weatherowpandroid.model.Weather.class);
        long tableNativePtr = table.getNativePtr();
        WeatherColumnInfo columnInfo = (WeatherColumnInfo) realm.getSchema().getColumnInfo(com.example.weatherowpandroid.model.Weather.class);
        com.example.weatherowpandroid.model.Weather object = null;
        while (objects.hasNext()) {
            object = (com.example.weatherowpandroid.model.Weather) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            Number realmGet$id = ((com_example_weatherowpandroid_model_WeatherRealmProxyInterface) object).realmGet$id();
            if (realmGet$id != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.idIndex, rowIndex, realmGet$id.longValue(), false);
            }
            String realmGet$main = ((com_example_weatherowpandroid_model_WeatherRealmProxyInterface) object).realmGet$main();
            if (realmGet$main != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.mainIndex, rowIndex, realmGet$main, false);
            }
            String realmGet$description = ((com_example_weatherowpandroid_model_WeatherRealmProxyInterface) object).realmGet$description();
            if (realmGet$description != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.descriptionIndex, rowIndex, realmGet$description, false);
            }
            String realmGet$icon = ((com_example_weatherowpandroid_model_WeatherRealmProxyInterface) object).realmGet$icon();
            if (realmGet$icon != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.iconIndex, rowIndex, realmGet$icon, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.example.weatherowpandroid.model.Weather object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.example.weatherowpandroid.model.Weather.class);
        long tableNativePtr = table.getNativePtr();
        WeatherColumnInfo columnInfo = (WeatherColumnInfo) realm.getSchema().getColumnInfo(com.example.weatherowpandroid.model.Weather.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        Number realmGet$id = ((com_example_weatherowpandroid_model_WeatherRealmProxyInterface) object).realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.idIndex, rowIndex, realmGet$id.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.idIndex, rowIndex, false);
        }
        String realmGet$main = ((com_example_weatherowpandroid_model_WeatherRealmProxyInterface) object).realmGet$main();
        if (realmGet$main != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.mainIndex, rowIndex, realmGet$main, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.mainIndex, rowIndex, false);
        }
        String realmGet$description = ((com_example_weatherowpandroid_model_WeatherRealmProxyInterface) object).realmGet$description();
        if (realmGet$description != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.descriptionIndex, rowIndex, realmGet$description, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.descriptionIndex, rowIndex, false);
        }
        String realmGet$icon = ((com_example_weatherowpandroid_model_WeatherRealmProxyInterface) object).realmGet$icon();
        if (realmGet$icon != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.iconIndex, rowIndex, realmGet$icon, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.iconIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.example.weatherowpandroid.model.Weather.class);
        long tableNativePtr = table.getNativePtr();
        WeatherColumnInfo columnInfo = (WeatherColumnInfo) realm.getSchema().getColumnInfo(com.example.weatherowpandroid.model.Weather.class);
        com.example.weatherowpandroid.model.Weather object = null;
        while (objects.hasNext()) {
            object = (com.example.weatherowpandroid.model.Weather) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            Number realmGet$id = ((com_example_weatherowpandroid_model_WeatherRealmProxyInterface) object).realmGet$id();
            if (realmGet$id != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.idIndex, rowIndex, realmGet$id.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.idIndex, rowIndex, false);
            }
            String realmGet$main = ((com_example_weatherowpandroid_model_WeatherRealmProxyInterface) object).realmGet$main();
            if (realmGet$main != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.mainIndex, rowIndex, realmGet$main, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.mainIndex, rowIndex, false);
            }
            String realmGet$description = ((com_example_weatherowpandroid_model_WeatherRealmProxyInterface) object).realmGet$description();
            if (realmGet$description != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.descriptionIndex, rowIndex, realmGet$description, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.descriptionIndex, rowIndex, false);
            }
            String realmGet$icon = ((com_example_weatherowpandroid_model_WeatherRealmProxyInterface) object).realmGet$icon();
            if (realmGet$icon != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.iconIndex, rowIndex, realmGet$icon, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.iconIndex, rowIndex, false);
            }
        }
    }

    public static com.example.weatherowpandroid.model.Weather createDetachedCopy(com.example.weatherowpandroid.model.Weather realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.example.weatherowpandroid.model.Weather unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.example.weatherowpandroid.model.Weather();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.example.weatherowpandroid.model.Weather) cachedObject.object;
            }
            unmanagedObject = (com.example.weatherowpandroid.model.Weather) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_example_weatherowpandroid_model_WeatherRealmProxyInterface unmanagedCopy = (com_example_weatherowpandroid_model_WeatherRealmProxyInterface) unmanagedObject;
        com_example_weatherowpandroid_model_WeatherRealmProxyInterface realmSource = (com_example_weatherowpandroid_model_WeatherRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$main(realmSource.realmGet$main());
        unmanagedCopy.realmSet$description(realmSource.realmGet$description());
        unmanagedCopy.realmSet$icon(realmSource.realmGet$icon());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Weather = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id() != null ? realmGet$id() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{main:");
        stringBuilder.append(realmGet$main() != null ? realmGet$main() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{description:");
        stringBuilder.append(realmGet$description() != null ? realmGet$description() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{icon:");
        stringBuilder.append(realmGet$icon() != null ? realmGet$icon() : "null");
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
        com_example_weatherowpandroid_model_WeatherRealmProxy aWeather = (com_example_weatherowpandroid_model_WeatherRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aWeather.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aWeather.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aWeather.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
