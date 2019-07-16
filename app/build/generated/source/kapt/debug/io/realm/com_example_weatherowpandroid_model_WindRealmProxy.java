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
public class com_example_weatherowpandroid_model_WindRealmProxy extends com.example.weatherowpandroid.model.Wind
    implements RealmObjectProxy, com_example_weatherowpandroid_model_WindRealmProxyInterface {

    static final class WindColumnInfo extends ColumnInfo {
        long speedIndex;
        long degIndex;

        WindColumnInfo(OsSchemaInfo schemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Wind");
            this.speedIndex = addColumnDetails("speed", "speed", objectSchemaInfo);
            this.degIndex = addColumnDetails("deg", "deg", objectSchemaInfo);
        }

        WindColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new WindColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final WindColumnInfo src = (WindColumnInfo) rawSrc;
            final WindColumnInfo dst = (WindColumnInfo) rawDst;
            dst.speedIndex = src.speedIndex;
            dst.degIndex = src.degIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private WindColumnInfo columnInfo;
    private ProxyState<com.example.weatherowpandroid.model.Wind> proxyState;

    com_example_weatherowpandroid_model_WindRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (WindColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.example.weatherowpandroid.model.Wind>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public Float realmGet$speed() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.speedIndex)) {
            return null;
        }
        return (float) proxyState.getRow$realm().getFloat(columnInfo.speedIndex);
    }

    @Override
    public void realmSet$speed(Float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.speedIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setFloat(columnInfo.speedIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.speedIndex);
            return;
        }
        proxyState.getRow$realm().setFloat(columnInfo.speedIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Float realmGet$deg() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.degIndex)) {
            return null;
        }
        return (float) proxyState.getRow$realm().getFloat(columnInfo.degIndex);
    }

    @Override
    public void realmSet$deg(Float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.degIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setFloat(columnInfo.degIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.degIndex);
            return;
        }
        proxyState.getRow$realm().setFloat(columnInfo.degIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Wind", 2, 0);
        builder.addPersistedProperty("speed", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("deg", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static WindColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new WindColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Wind";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Wind";
    }

    @SuppressWarnings("cast")
    public static com.example.weatherowpandroid.model.Wind createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.example.weatherowpandroid.model.Wind obj = realm.createObjectInternal(com.example.weatherowpandroid.model.Wind.class, true, excludeFields);

        final com_example_weatherowpandroid_model_WindRealmProxyInterface objProxy = (com_example_weatherowpandroid_model_WindRealmProxyInterface) obj;
        if (json.has("speed")) {
            if (json.isNull("speed")) {
                objProxy.realmSet$speed(null);
            } else {
                objProxy.realmSet$speed((float) json.getDouble("speed"));
            }
        }
        if (json.has("deg")) {
            if (json.isNull("deg")) {
                objProxy.realmSet$deg(null);
            } else {
                objProxy.realmSet$deg((float) json.getDouble("deg"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.example.weatherowpandroid.model.Wind createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.example.weatherowpandroid.model.Wind obj = new com.example.weatherowpandroid.model.Wind();
        final com_example_weatherowpandroid_model_WindRealmProxyInterface objProxy = (com_example_weatherowpandroid_model_WindRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("speed")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$speed((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$speed(null);
                }
            } else if (name.equals("deg")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$deg((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$deg(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    public static com.example.weatherowpandroid.model.Wind copyOrUpdate(Realm realm, com.example.weatherowpandroid.model.Wind object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
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
            return (com.example.weatherowpandroid.model.Wind) cachedRealmObject;
        }

        return copy(realm, object, update, cache);
    }

    public static com.example.weatherowpandroid.model.Wind copy(Realm realm, com.example.weatherowpandroid.model.Wind newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.example.weatherowpandroid.model.Wind) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.example.weatherowpandroid.model.Wind realmObject = realm.createObjectInternal(com.example.weatherowpandroid.model.Wind.class, false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        com_example_weatherowpandroid_model_WindRealmProxyInterface realmObjectSource = (com_example_weatherowpandroid_model_WindRealmProxyInterface) newObject;
        com_example_weatherowpandroid_model_WindRealmProxyInterface realmObjectCopy = (com_example_weatherowpandroid_model_WindRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$speed(realmObjectSource.realmGet$speed());
        realmObjectCopy.realmSet$deg(realmObjectSource.realmGet$deg());
        return realmObject;
    }

    public static long insert(Realm realm, com.example.weatherowpandroid.model.Wind object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.example.weatherowpandroid.model.Wind.class);
        long tableNativePtr = table.getNativePtr();
        WindColumnInfo columnInfo = (WindColumnInfo) realm.getSchema().getColumnInfo(com.example.weatherowpandroid.model.Wind.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        Float realmGet$speed = ((com_example_weatherowpandroid_model_WindRealmProxyInterface) object).realmGet$speed();
        if (realmGet$speed != null) {
            Table.nativeSetFloat(tableNativePtr, columnInfo.speedIndex, rowIndex, realmGet$speed, false);
        }
        Float realmGet$deg = ((com_example_weatherowpandroid_model_WindRealmProxyInterface) object).realmGet$deg();
        if (realmGet$deg != null) {
            Table.nativeSetFloat(tableNativePtr, columnInfo.degIndex, rowIndex, realmGet$deg, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.example.weatherowpandroid.model.Wind.class);
        long tableNativePtr = table.getNativePtr();
        WindColumnInfo columnInfo = (WindColumnInfo) realm.getSchema().getColumnInfo(com.example.weatherowpandroid.model.Wind.class);
        com.example.weatherowpandroid.model.Wind object = null;
        while (objects.hasNext()) {
            object = (com.example.weatherowpandroid.model.Wind) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            Float realmGet$speed = ((com_example_weatherowpandroid_model_WindRealmProxyInterface) object).realmGet$speed();
            if (realmGet$speed != null) {
                Table.nativeSetFloat(tableNativePtr, columnInfo.speedIndex, rowIndex, realmGet$speed, false);
            }
            Float realmGet$deg = ((com_example_weatherowpandroid_model_WindRealmProxyInterface) object).realmGet$deg();
            if (realmGet$deg != null) {
                Table.nativeSetFloat(tableNativePtr, columnInfo.degIndex, rowIndex, realmGet$deg, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.example.weatherowpandroid.model.Wind object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.example.weatherowpandroid.model.Wind.class);
        long tableNativePtr = table.getNativePtr();
        WindColumnInfo columnInfo = (WindColumnInfo) realm.getSchema().getColumnInfo(com.example.weatherowpandroid.model.Wind.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        Float realmGet$speed = ((com_example_weatherowpandroid_model_WindRealmProxyInterface) object).realmGet$speed();
        if (realmGet$speed != null) {
            Table.nativeSetFloat(tableNativePtr, columnInfo.speedIndex, rowIndex, realmGet$speed, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.speedIndex, rowIndex, false);
        }
        Float realmGet$deg = ((com_example_weatherowpandroid_model_WindRealmProxyInterface) object).realmGet$deg();
        if (realmGet$deg != null) {
            Table.nativeSetFloat(tableNativePtr, columnInfo.degIndex, rowIndex, realmGet$deg, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.degIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.example.weatherowpandroid.model.Wind.class);
        long tableNativePtr = table.getNativePtr();
        WindColumnInfo columnInfo = (WindColumnInfo) realm.getSchema().getColumnInfo(com.example.weatherowpandroid.model.Wind.class);
        com.example.weatherowpandroid.model.Wind object = null;
        while (objects.hasNext()) {
            object = (com.example.weatherowpandroid.model.Wind) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            Float realmGet$speed = ((com_example_weatherowpandroid_model_WindRealmProxyInterface) object).realmGet$speed();
            if (realmGet$speed != null) {
                Table.nativeSetFloat(tableNativePtr, columnInfo.speedIndex, rowIndex, realmGet$speed, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.speedIndex, rowIndex, false);
            }
            Float realmGet$deg = ((com_example_weatherowpandroid_model_WindRealmProxyInterface) object).realmGet$deg();
            if (realmGet$deg != null) {
                Table.nativeSetFloat(tableNativePtr, columnInfo.degIndex, rowIndex, realmGet$deg, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.degIndex, rowIndex, false);
            }
        }
    }

    public static com.example.weatherowpandroid.model.Wind createDetachedCopy(com.example.weatherowpandroid.model.Wind realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.example.weatherowpandroid.model.Wind unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.example.weatherowpandroid.model.Wind();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.example.weatherowpandroid.model.Wind) cachedObject.object;
            }
            unmanagedObject = (com.example.weatherowpandroid.model.Wind) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_example_weatherowpandroid_model_WindRealmProxyInterface unmanagedCopy = (com_example_weatherowpandroid_model_WindRealmProxyInterface) unmanagedObject;
        com_example_weatherowpandroid_model_WindRealmProxyInterface realmSource = (com_example_weatherowpandroid_model_WindRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$speed(realmSource.realmGet$speed());
        unmanagedCopy.realmSet$deg(realmSource.realmGet$deg());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Wind = proxy[");
        stringBuilder.append("{speed:");
        stringBuilder.append(realmGet$speed() != null ? realmGet$speed() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{deg:");
        stringBuilder.append(realmGet$deg() != null ? realmGet$deg() : "null");
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
        com_example_weatherowpandroid_model_WindRealmProxy aWind = (com_example_weatherowpandroid_model_WindRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aWind.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aWind.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aWind.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
