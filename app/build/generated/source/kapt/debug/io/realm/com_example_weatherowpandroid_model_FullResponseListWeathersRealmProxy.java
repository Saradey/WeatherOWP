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
public class com_example_weatherowpandroid_model_FullResponseListWeathersRealmProxy extends com.example.weatherowpandroid.model.FullResponseListWeathers
    implements RealmObjectProxy, com_example_weatherowpandroid_model_FullResponseListWeathersRealmProxyInterface {

    static final class FullResponseListWeathersColumnInfo extends ColumnInfo {
        long codIndex;
        long listIndex;

        FullResponseListWeathersColumnInfo(OsSchemaInfo schemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("FullResponseListWeathers");
            this.codIndex = addColumnDetails("cod", "cod", objectSchemaInfo);
            this.listIndex = addColumnDetails("list", "list", objectSchemaInfo);
        }

        FullResponseListWeathersColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new FullResponseListWeathersColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final FullResponseListWeathersColumnInfo src = (FullResponseListWeathersColumnInfo) rawSrc;
            final FullResponseListWeathersColumnInfo dst = (FullResponseListWeathersColumnInfo) rawDst;
            dst.codIndex = src.codIndex;
            dst.listIndex = src.listIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private FullResponseListWeathersColumnInfo columnInfo;
    private ProxyState<com.example.weatherowpandroid.model.FullResponseListWeathers> proxyState;
    private RealmList<com.example.weatherowpandroid.model.ListWeathers> listRealmList;

    com_example_weatherowpandroid_model_FullResponseListWeathersRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (FullResponseListWeathersColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.example.weatherowpandroid.model.FullResponseListWeathers>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$cod() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.codIndex);
    }

    @Override
    public void realmSet$cod(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.codIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.codIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.codIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.codIndex, value);
    }

    @Override
    public RealmList<com.example.weatherowpandroid.model.ListWeathers> realmGet$list() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (listRealmList != null) {
            return listRealmList;
        } else {
            OsList osList = proxyState.getRow$realm().getModelList(columnInfo.listIndex);
            listRealmList = new RealmList<com.example.weatherowpandroid.model.ListWeathers>(com.example.weatherowpandroid.model.ListWeathers.class, osList, proxyState.getRealm$realm());
            return listRealmList;
        }
    }

    @Override
    public void realmSet$list(RealmList<com.example.weatherowpandroid.model.ListWeathers> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("list")) {
                return;
            }
            // if the list contains unmanaged RealmObjects, convert them to managed.
            if (value != null && !value.isManaged()) {
                final Realm realm = (Realm) proxyState.getRealm$realm();
                final RealmList<com.example.weatherowpandroid.model.ListWeathers> original = value;
                value = new RealmList<com.example.weatherowpandroid.model.ListWeathers>();
                for (com.example.weatherowpandroid.model.ListWeathers item : original) {
                    if (item == null || RealmObject.isManaged(item)) {
                        value.add(item);
                    } else {
                        value.add(realm.copyToRealm(item));
                    }
                }
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        OsList osList = proxyState.getRow$realm().getModelList(columnInfo.listIndex);
        // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
        if (value != null && value.size() == osList.size()) {
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                com.example.weatherowpandroid.model.ListWeathers linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.setRow(i, ((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getIndex());
            }
        } else {
            osList.removeAll();
            if (value == null) {
                return;
            }
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                com.example.weatherowpandroid.model.ListWeathers linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.addRow(((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getIndex());
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("FullResponseListWeathers", 2, 0);
        builder.addPersistedProperty("cod", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedLinkProperty("list", RealmFieldType.LIST, "ListWeathers");
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static FullResponseListWeathersColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new FullResponseListWeathersColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "FullResponseListWeathers";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "FullResponseListWeathers";
    }

    @SuppressWarnings("cast")
    public static com.example.weatherowpandroid.model.FullResponseListWeathers createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(1);
        if (json.has("list")) {
            excludeFields.add("list");
        }
        com.example.weatherowpandroid.model.FullResponseListWeathers obj = realm.createObjectInternal(com.example.weatherowpandroid.model.FullResponseListWeathers.class, true, excludeFields);

        final com_example_weatherowpandroid_model_FullResponseListWeathersRealmProxyInterface objProxy = (com_example_weatherowpandroid_model_FullResponseListWeathersRealmProxyInterface) obj;
        if (json.has("cod")) {
            if (json.isNull("cod")) {
                objProxy.realmSet$cod(null);
            } else {
                objProxy.realmSet$cod((String) json.getString("cod"));
            }
        }
        if (json.has("list")) {
            if (json.isNull("list")) {
                objProxy.realmSet$list(null);
            } else {
                objProxy.realmGet$list().clear();
                JSONArray array = json.getJSONArray("list");
                for (int i = 0; i < array.length(); i++) {
                    com.example.weatherowpandroid.model.ListWeathers item = com_example_weatherowpandroid_model_ListWeathersRealmProxy.createOrUpdateUsingJsonObject(realm, array.getJSONObject(i), update);
                    objProxy.realmGet$list().add(item);
                }
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.example.weatherowpandroid.model.FullResponseListWeathers createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.example.weatherowpandroid.model.FullResponseListWeathers obj = new com.example.weatherowpandroid.model.FullResponseListWeathers();
        final com_example_weatherowpandroid_model_FullResponseListWeathersRealmProxyInterface objProxy = (com_example_weatherowpandroid_model_FullResponseListWeathersRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("cod")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$cod((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$cod(null);
                }
            } else if (name.equals("list")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$list(null);
                } else {
                    objProxy.realmSet$list(new RealmList<com.example.weatherowpandroid.model.ListWeathers>());
                    reader.beginArray();
                    while (reader.hasNext()) {
                        com.example.weatherowpandroid.model.ListWeathers item = com_example_weatherowpandroid_model_ListWeathersRealmProxy.createUsingJsonStream(realm, reader);
                        objProxy.realmGet$list().add(item);
                    }
                    reader.endArray();
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    public static com.example.weatherowpandroid.model.FullResponseListWeathers copyOrUpdate(Realm realm, com.example.weatherowpandroid.model.FullResponseListWeathers object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
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
            return (com.example.weatherowpandroid.model.FullResponseListWeathers) cachedRealmObject;
        }

        return copy(realm, object, update, cache);
    }

    public static com.example.weatherowpandroid.model.FullResponseListWeathers copy(Realm realm, com.example.weatherowpandroid.model.FullResponseListWeathers newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.example.weatherowpandroid.model.FullResponseListWeathers) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.example.weatherowpandroid.model.FullResponseListWeathers realmObject = realm.createObjectInternal(com.example.weatherowpandroid.model.FullResponseListWeathers.class, false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        com_example_weatherowpandroid_model_FullResponseListWeathersRealmProxyInterface realmObjectSource = (com_example_weatherowpandroid_model_FullResponseListWeathersRealmProxyInterface) newObject;
        com_example_weatherowpandroid_model_FullResponseListWeathersRealmProxyInterface realmObjectCopy = (com_example_weatherowpandroid_model_FullResponseListWeathersRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$cod(realmObjectSource.realmGet$cod());

        RealmList<com.example.weatherowpandroid.model.ListWeathers> listList = realmObjectSource.realmGet$list();
        if (listList != null) {
            RealmList<com.example.weatherowpandroid.model.ListWeathers> listRealmList = realmObjectCopy.realmGet$list();
            listRealmList.clear();
            for (int i = 0; i < listList.size(); i++) {
                com.example.weatherowpandroid.model.ListWeathers listItem = listList.get(i);
                com.example.weatherowpandroid.model.ListWeathers cachelist = (com.example.weatherowpandroid.model.ListWeathers) cache.get(listItem);
                if (cachelist != null) {
                    listRealmList.add(cachelist);
                } else {
                    listRealmList.add(com_example_weatherowpandroid_model_ListWeathersRealmProxy.copyOrUpdate(realm, listItem, update, cache));
                }
            }
        }

        return realmObject;
    }

    public static long insert(Realm realm, com.example.weatherowpandroid.model.FullResponseListWeathers object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.example.weatherowpandroid.model.FullResponseListWeathers.class);
        long tableNativePtr = table.getNativePtr();
        FullResponseListWeathersColumnInfo columnInfo = (FullResponseListWeathersColumnInfo) realm.getSchema().getColumnInfo(com.example.weatherowpandroid.model.FullResponseListWeathers.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        String realmGet$cod = ((com_example_weatherowpandroid_model_FullResponseListWeathersRealmProxyInterface) object).realmGet$cod();
        if (realmGet$cod != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.codIndex, rowIndex, realmGet$cod, false);
        }

        RealmList<com.example.weatherowpandroid.model.ListWeathers> listList = ((com_example_weatherowpandroid_model_FullResponseListWeathersRealmProxyInterface) object).realmGet$list();
        if (listList != null) {
            OsList listOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.listIndex);
            for (com.example.weatherowpandroid.model.ListWeathers listItem : listList) {
                Long cacheItemIndexlist = cache.get(listItem);
                if (cacheItemIndexlist == null) {
                    cacheItemIndexlist = com_example_weatherowpandroid_model_ListWeathersRealmProxy.insert(realm, listItem, cache);
                }
                listOsList.addRow(cacheItemIndexlist);
            }
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.example.weatherowpandroid.model.FullResponseListWeathers.class);
        long tableNativePtr = table.getNativePtr();
        FullResponseListWeathersColumnInfo columnInfo = (FullResponseListWeathersColumnInfo) realm.getSchema().getColumnInfo(com.example.weatherowpandroid.model.FullResponseListWeathers.class);
        com.example.weatherowpandroid.model.FullResponseListWeathers object = null;
        while (objects.hasNext()) {
            object = (com.example.weatherowpandroid.model.FullResponseListWeathers) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            String realmGet$cod = ((com_example_weatherowpandroid_model_FullResponseListWeathersRealmProxyInterface) object).realmGet$cod();
            if (realmGet$cod != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.codIndex, rowIndex, realmGet$cod, false);
            }

            RealmList<com.example.weatherowpandroid.model.ListWeathers> listList = ((com_example_weatherowpandroid_model_FullResponseListWeathersRealmProxyInterface) object).realmGet$list();
            if (listList != null) {
                OsList listOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.listIndex);
                for (com.example.weatherowpandroid.model.ListWeathers listItem : listList) {
                    Long cacheItemIndexlist = cache.get(listItem);
                    if (cacheItemIndexlist == null) {
                        cacheItemIndexlist = com_example_weatherowpandroid_model_ListWeathersRealmProxy.insert(realm, listItem, cache);
                    }
                    listOsList.addRow(cacheItemIndexlist);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.example.weatherowpandroid.model.FullResponseListWeathers object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.example.weatherowpandroid.model.FullResponseListWeathers.class);
        long tableNativePtr = table.getNativePtr();
        FullResponseListWeathersColumnInfo columnInfo = (FullResponseListWeathersColumnInfo) realm.getSchema().getColumnInfo(com.example.weatherowpandroid.model.FullResponseListWeathers.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        String realmGet$cod = ((com_example_weatherowpandroid_model_FullResponseListWeathersRealmProxyInterface) object).realmGet$cod();
        if (realmGet$cod != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.codIndex, rowIndex, realmGet$cod, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.codIndex, rowIndex, false);
        }

        OsList listOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.listIndex);
        RealmList<com.example.weatherowpandroid.model.ListWeathers> listList = ((com_example_weatherowpandroid_model_FullResponseListWeathersRealmProxyInterface) object).realmGet$list();
        if (listList != null && listList.size() == listOsList.size()) {
            // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
            int objects = listList.size();
            for (int i = 0; i < objects; i++) {
                com.example.weatherowpandroid.model.ListWeathers listItem = listList.get(i);
                Long cacheItemIndexlist = cache.get(listItem);
                if (cacheItemIndexlist == null) {
                    cacheItemIndexlist = com_example_weatherowpandroid_model_ListWeathersRealmProxy.insertOrUpdate(realm, listItem, cache);
                }
                listOsList.setRow(i, cacheItemIndexlist);
            }
        } else {
            listOsList.removeAll();
            if (listList != null) {
                for (com.example.weatherowpandroid.model.ListWeathers listItem : listList) {
                    Long cacheItemIndexlist = cache.get(listItem);
                    if (cacheItemIndexlist == null) {
                        cacheItemIndexlist = com_example_weatherowpandroid_model_ListWeathersRealmProxy.insertOrUpdate(realm, listItem, cache);
                    }
                    listOsList.addRow(cacheItemIndexlist);
                }
            }
        }

        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.example.weatherowpandroid.model.FullResponseListWeathers.class);
        long tableNativePtr = table.getNativePtr();
        FullResponseListWeathersColumnInfo columnInfo = (FullResponseListWeathersColumnInfo) realm.getSchema().getColumnInfo(com.example.weatherowpandroid.model.FullResponseListWeathers.class);
        com.example.weatherowpandroid.model.FullResponseListWeathers object = null;
        while (objects.hasNext()) {
            object = (com.example.weatherowpandroid.model.FullResponseListWeathers) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            String realmGet$cod = ((com_example_weatherowpandroid_model_FullResponseListWeathersRealmProxyInterface) object).realmGet$cod();
            if (realmGet$cod != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.codIndex, rowIndex, realmGet$cod, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.codIndex, rowIndex, false);
            }

            OsList listOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.listIndex);
            RealmList<com.example.weatherowpandroid.model.ListWeathers> listList = ((com_example_weatherowpandroid_model_FullResponseListWeathersRealmProxyInterface) object).realmGet$list();
            if (listList != null && listList.size() == listOsList.size()) {
                // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
                int objectCount = listList.size();
                for (int i = 0; i < objectCount; i++) {
                    com.example.weatherowpandroid.model.ListWeathers listItem = listList.get(i);
                    Long cacheItemIndexlist = cache.get(listItem);
                    if (cacheItemIndexlist == null) {
                        cacheItemIndexlist = com_example_weatherowpandroid_model_ListWeathersRealmProxy.insertOrUpdate(realm, listItem, cache);
                    }
                    listOsList.setRow(i, cacheItemIndexlist);
                }
            } else {
                listOsList.removeAll();
                if (listList != null) {
                    for (com.example.weatherowpandroid.model.ListWeathers listItem : listList) {
                        Long cacheItemIndexlist = cache.get(listItem);
                        if (cacheItemIndexlist == null) {
                            cacheItemIndexlist = com_example_weatherowpandroid_model_ListWeathersRealmProxy.insertOrUpdate(realm, listItem, cache);
                        }
                        listOsList.addRow(cacheItemIndexlist);
                    }
                }
            }

        }
    }

    public static com.example.weatherowpandroid.model.FullResponseListWeathers createDetachedCopy(com.example.weatherowpandroid.model.FullResponseListWeathers realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.example.weatherowpandroid.model.FullResponseListWeathers unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.example.weatherowpandroid.model.FullResponseListWeathers();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.example.weatherowpandroid.model.FullResponseListWeathers) cachedObject.object;
            }
            unmanagedObject = (com.example.weatherowpandroid.model.FullResponseListWeathers) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_example_weatherowpandroid_model_FullResponseListWeathersRealmProxyInterface unmanagedCopy = (com_example_weatherowpandroid_model_FullResponseListWeathersRealmProxyInterface) unmanagedObject;
        com_example_weatherowpandroid_model_FullResponseListWeathersRealmProxyInterface realmSource = (com_example_weatherowpandroid_model_FullResponseListWeathersRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$cod(realmSource.realmGet$cod());

        // Deep copy of list
        if (currentDepth == maxDepth) {
            unmanagedCopy.realmSet$list(null);
        } else {
            RealmList<com.example.weatherowpandroid.model.ListWeathers> managedlistList = realmSource.realmGet$list();
            RealmList<com.example.weatherowpandroid.model.ListWeathers> unmanagedlistList = new RealmList<com.example.weatherowpandroid.model.ListWeathers>();
            unmanagedCopy.realmSet$list(unmanagedlistList);
            int nextDepth = currentDepth + 1;
            int size = managedlistList.size();
            for (int i = 0; i < size; i++) {
                com.example.weatherowpandroid.model.ListWeathers item = com_example_weatherowpandroid_model_ListWeathersRealmProxy.createDetachedCopy(managedlistList.get(i), nextDepth, maxDepth, cache);
                unmanagedlistList.add(item);
            }
        }

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("FullResponseListWeathers = proxy[");
        stringBuilder.append("{cod:");
        stringBuilder.append(realmGet$cod() != null ? realmGet$cod() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{list:");
        stringBuilder.append("RealmList<ListWeathers>[").append(realmGet$list().size()).append("]");
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
        com_example_weatherowpandroid_model_FullResponseListWeathersRealmProxy aFullResponseListWeathers = (com_example_weatherowpandroid_model_FullResponseListWeathersRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aFullResponseListWeathers.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aFullResponseListWeathers.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aFullResponseListWeathers.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
