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
public class com_example_weatherowpandroid_model_SysRealmProxy extends com.example.weatherowpandroid.model.Sys
    implements RealmObjectProxy, com_example_weatherowpandroid_model_SysRealmProxyInterface {

    static final class SysColumnInfo extends ColumnInfo {
        long podIndex;

        SysColumnInfo(OsSchemaInfo schemaInfo) {
            super(1);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Sys");
            this.podIndex = addColumnDetails("pod", "pod", objectSchemaInfo);
        }

        SysColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new SysColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final SysColumnInfo src = (SysColumnInfo) rawSrc;
            final SysColumnInfo dst = (SysColumnInfo) rawDst;
            dst.podIndex = src.podIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private SysColumnInfo columnInfo;
    private ProxyState<com.example.weatherowpandroid.model.Sys> proxyState;

    com_example_weatherowpandroid_model_SysRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (SysColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.example.weatherowpandroid.model.Sys>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$pod() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.podIndex);
    }

    @Override
    public void realmSet$pod(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.podIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.podIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.podIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.podIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Sys", 1, 0);
        builder.addPersistedProperty("pod", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static SysColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new SysColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Sys";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Sys";
    }

    @SuppressWarnings("cast")
    public static com.example.weatherowpandroid.model.Sys createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.example.weatherowpandroid.model.Sys obj = realm.createObjectInternal(com.example.weatherowpandroid.model.Sys.class, true, excludeFields);

        final com_example_weatherowpandroid_model_SysRealmProxyInterface objProxy = (com_example_weatherowpandroid_model_SysRealmProxyInterface) obj;
        if (json.has("pod")) {
            if (json.isNull("pod")) {
                objProxy.realmSet$pod(null);
            } else {
                objProxy.realmSet$pod((String) json.getString("pod"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.example.weatherowpandroid.model.Sys createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.example.weatherowpandroid.model.Sys obj = new com.example.weatherowpandroid.model.Sys();
        final com_example_weatherowpandroid_model_SysRealmProxyInterface objProxy = (com_example_weatherowpandroid_model_SysRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("pod")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$pod((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$pod(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    public static com.example.weatherowpandroid.model.Sys copyOrUpdate(Realm realm, com.example.weatherowpandroid.model.Sys object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
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
            return (com.example.weatherowpandroid.model.Sys) cachedRealmObject;
        }

        return copy(realm, object, update, cache);
    }

    public static com.example.weatherowpandroid.model.Sys copy(Realm realm, com.example.weatherowpandroid.model.Sys newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.example.weatherowpandroid.model.Sys) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.example.weatherowpandroid.model.Sys realmObject = realm.createObjectInternal(com.example.weatherowpandroid.model.Sys.class, false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        com_example_weatherowpandroid_model_SysRealmProxyInterface realmObjectSource = (com_example_weatherowpandroid_model_SysRealmProxyInterface) newObject;
        com_example_weatherowpandroid_model_SysRealmProxyInterface realmObjectCopy = (com_example_weatherowpandroid_model_SysRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$pod(realmObjectSource.realmGet$pod());
        return realmObject;
    }

    public static long insert(Realm realm, com.example.weatherowpandroid.model.Sys object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.example.weatherowpandroid.model.Sys.class);
        long tableNativePtr = table.getNativePtr();
        SysColumnInfo columnInfo = (SysColumnInfo) realm.getSchema().getColumnInfo(com.example.weatherowpandroid.model.Sys.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        String realmGet$pod = ((com_example_weatherowpandroid_model_SysRealmProxyInterface) object).realmGet$pod();
        if (realmGet$pod != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.podIndex, rowIndex, realmGet$pod, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.example.weatherowpandroid.model.Sys.class);
        long tableNativePtr = table.getNativePtr();
        SysColumnInfo columnInfo = (SysColumnInfo) realm.getSchema().getColumnInfo(com.example.weatherowpandroid.model.Sys.class);
        com.example.weatherowpandroid.model.Sys object = null;
        while (objects.hasNext()) {
            object = (com.example.weatherowpandroid.model.Sys) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            String realmGet$pod = ((com_example_weatherowpandroid_model_SysRealmProxyInterface) object).realmGet$pod();
            if (realmGet$pod != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.podIndex, rowIndex, realmGet$pod, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.example.weatherowpandroid.model.Sys object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.example.weatherowpandroid.model.Sys.class);
        long tableNativePtr = table.getNativePtr();
        SysColumnInfo columnInfo = (SysColumnInfo) realm.getSchema().getColumnInfo(com.example.weatherowpandroid.model.Sys.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        String realmGet$pod = ((com_example_weatherowpandroid_model_SysRealmProxyInterface) object).realmGet$pod();
        if (realmGet$pod != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.podIndex, rowIndex, realmGet$pod, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.podIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.example.weatherowpandroid.model.Sys.class);
        long tableNativePtr = table.getNativePtr();
        SysColumnInfo columnInfo = (SysColumnInfo) realm.getSchema().getColumnInfo(com.example.weatherowpandroid.model.Sys.class);
        com.example.weatherowpandroid.model.Sys object = null;
        while (objects.hasNext()) {
            object = (com.example.weatherowpandroid.model.Sys) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            String realmGet$pod = ((com_example_weatherowpandroid_model_SysRealmProxyInterface) object).realmGet$pod();
            if (realmGet$pod != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.podIndex, rowIndex, realmGet$pod, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.podIndex, rowIndex, false);
            }
        }
    }

    public static com.example.weatherowpandroid.model.Sys createDetachedCopy(com.example.weatherowpandroid.model.Sys realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.example.weatherowpandroid.model.Sys unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.example.weatherowpandroid.model.Sys();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.example.weatherowpandroid.model.Sys) cachedObject.object;
            }
            unmanagedObject = (com.example.weatherowpandroid.model.Sys) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_example_weatherowpandroid_model_SysRealmProxyInterface unmanagedCopy = (com_example_weatherowpandroid_model_SysRealmProxyInterface) unmanagedObject;
        com_example_weatherowpandroid_model_SysRealmProxyInterface realmSource = (com_example_weatherowpandroid_model_SysRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$pod(realmSource.realmGet$pod());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Sys = proxy[");
        stringBuilder.append("{pod:");
        stringBuilder.append(realmGet$pod() != null ? realmGet$pod() : "null");
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
        com_example_weatherowpandroid_model_SysRealmProxy aSys = (com_example_weatherowpandroid_model_SysRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aSys.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aSys.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aSys.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
