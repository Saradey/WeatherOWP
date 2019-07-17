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
public class com_example_weatherowpandroid_model_ListWeathersRealmProxy extends com.example.weatherowpandroid.model.ListWeathers
    implements RealmObjectProxy, com_example_weatherowpandroid_model_ListWeathersRealmProxyInterface {

    static final class ListWeathersColumnInfo extends ColumnInfo {
        long dtIndex;
        long mainIndex;
        long weatherIndex;
        long cloudsIndex;
        long windIndex;
        long sysIndex;
        long dtTxtIndex;

        ListWeathersColumnInfo(OsSchemaInfo schemaInfo) {
            super(7);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("ListWeathers");
            this.dtIndex = addColumnDetails("dt", "dt", objectSchemaInfo);
            this.mainIndex = addColumnDetails("main", "main", objectSchemaInfo);
            this.weatherIndex = addColumnDetails("weather", "weather", objectSchemaInfo);
            this.cloudsIndex = addColumnDetails("clouds", "clouds", objectSchemaInfo);
            this.windIndex = addColumnDetails("wind", "wind", objectSchemaInfo);
            this.sysIndex = addColumnDetails("sys", "sys", objectSchemaInfo);
            this.dtTxtIndex = addColumnDetails("dtTxt", "dtTxt", objectSchemaInfo);
        }

        ListWeathersColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new ListWeathersColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final ListWeathersColumnInfo src = (ListWeathersColumnInfo) rawSrc;
            final ListWeathersColumnInfo dst = (ListWeathersColumnInfo) rawDst;
            dst.dtIndex = src.dtIndex;
            dst.mainIndex = src.mainIndex;
            dst.weatherIndex = src.weatherIndex;
            dst.cloudsIndex = src.cloudsIndex;
            dst.windIndex = src.windIndex;
            dst.sysIndex = src.sysIndex;
            dst.dtTxtIndex = src.dtTxtIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private ListWeathersColumnInfo columnInfo;
    private ProxyState<com.example.weatherowpandroid.model.ListWeathers> proxyState;
    private RealmList<com.example.weatherowpandroid.model.Weather> weatherRealmList;

    com_example_weatherowpandroid_model_ListWeathersRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (ListWeathersColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.example.weatherowpandroid.model.ListWeathers>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public Long realmGet$dt() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.dtIndex)) {
            return null;
        }
        return (long) proxyState.getRow$realm().getLong(columnInfo.dtIndex);
    }

    @Override
    public void realmSet$dt(Long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.dtIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.dtIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.dtIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.dtIndex, value);
    }

    @Override
    public com.example.weatherowpandroid.model.Main realmGet$main() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNullLink(columnInfo.mainIndex)) {
            return null;
        }
        return proxyState.getRealm$realm().get(com.example.weatherowpandroid.model.Main.class, proxyState.getRow$realm().getLink(columnInfo.mainIndex), false, Collections.<String>emptyList());
    }

    @Override
    public void realmSet$main(com.example.weatherowpandroid.model.Main value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("main")) {
                return;
            }
            if (value != null && !RealmObject.isManaged(value)) {
                value = ((Realm) proxyState.getRealm$realm()).copyToRealm(value);
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                // Table#nullifyLink() does not support default value. Just using Row.
                row.nullifyLink(columnInfo.mainIndex);
                return;
            }
            proxyState.checkValidObject(value);
            row.getTable().setLink(columnInfo.mainIndex, row.getIndex(), ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex(), true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().nullifyLink(columnInfo.mainIndex);
            return;
        }
        proxyState.checkValidObject(value);
        proxyState.getRow$realm().setLink(columnInfo.mainIndex, ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex());
    }

    @Override
    public RealmList<com.example.weatherowpandroid.model.Weather> realmGet$weather() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (weatherRealmList != null) {
            return weatherRealmList;
        } else {
            OsList osList = proxyState.getRow$realm().getModelList(columnInfo.weatherIndex);
            weatherRealmList = new RealmList<com.example.weatherowpandroid.model.Weather>(com.example.weatherowpandroid.model.Weather.class, osList, proxyState.getRealm$realm());
            return weatherRealmList;
        }
    }

    @Override
    public void realmSet$weather(RealmList<com.example.weatherowpandroid.model.Weather> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("weather")) {
                return;
            }
            // if the list contains unmanaged RealmObjects, convert them to managed.
            if (value != null && !value.isManaged()) {
                final Realm realm = (Realm) proxyState.getRealm$realm();
                final RealmList<com.example.weatherowpandroid.model.Weather> original = value;
                value = new RealmList<com.example.weatherowpandroid.model.Weather>();
                for (com.example.weatherowpandroid.model.Weather item : original) {
                    if (item == null || RealmObject.isManaged(item)) {
                        value.add(item);
                    } else {
                        value.add(realm.copyToRealm(item));
                    }
                }
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        OsList osList = proxyState.getRow$realm().getModelList(columnInfo.weatherIndex);
        // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
        if (value != null && value.size() == osList.size()) {
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                com.example.weatherowpandroid.model.Weather linkedObject = value.get(i);
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
                com.example.weatherowpandroid.model.Weather linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.addRow(((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getIndex());
            }
        }
    }

    @Override
    public com.example.weatherowpandroid.model.Clouds realmGet$clouds() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNullLink(columnInfo.cloudsIndex)) {
            return null;
        }
        return proxyState.getRealm$realm().get(com.example.weatherowpandroid.model.Clouds.class, proxyState.getRow$realm().getLink(columnInfo.cloudsIndex), false, Collections.<String>emptyList());
    }

    @Override
    public void realmSet$clouds(com.example.weatherowpandroid.model.Clouds value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("clouds")) {
                return;
            }
            if (value != null && !RealmObject.isManaged(value)) {
                value = ((Realm) proxyState.getRealm$realm()).copyToRealm(value);
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                // Table#nullifyLink() does not support default value. Just using Row.
                row.nullifyLink(columnInfo.cloudsIndex);
                return;
            }
            proxyState.checkValidObject(value);
            row.getTable().setLink(columnInfo.cloudsIndex, row.getIndex(), ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex(), true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().nullifyLink(columnInfo.cloudsIndex);
            return;
        }
        proxyState.checkValidObject(value);
        proxyState.getRow$realm().setLink(columnInfo.cloudsIndex, ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex());
    }

    @Override
    public com.example.weatherowpandroid.model.Wind realmGet$wind() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNullLink(columnInfo.windIndex)) {
            return null;
        }
        return proxyState.getRealm$realm().get(com.example.weatherowpandroid.model.Wind.class, proxyState.getRow$realm().getLink(columnInfo.windIndex), false, Collections.<String>emptyList());
    }

    @Override
    public void realmSet$wind(com.example.weatherowpandroid.model.Wind value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("wind")) {
                return;
            }
            if (value != null && !RealmObject.isManaged(value)) {
                value = ((Realm) proxyState.getRealm$realm()).copyToRealm(value);
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                // Table#nullifyLink() does not support default value. Just using Row.
                row.nullifyLink(columnInfo.windIndex);
                return;
            }
            proxyState.checkValidObject(value);
            row.getTable().setLink(columnInfo.windIndex, row.getIndex(), ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex(), true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().nullifyLink(columnInfo.windIndex);
            return;
        }
        proxyState.checkValidObject(value);
        proxyState.getRow$realm().setLink(columnInfo.windIndex, ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex());
    }

    @Override
    public com.example.weatherowpandroid.model.Sys realmGet$sys() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNullLink(columnInfo.sysIndex)) {
            return null;
        }
        return proxyState.getRealm$realm().get(com.example.weatherowpandroid.model.Sys.class, proxyState.getRow$realm().getLink(columnInfo.sysIndex), false, Collections.<String>emptyList());
    }

    @Override
    public void realmSet$sys(com.example.weatherowpandroid.model.Sys value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("sys")) {
                return;
            }
            if (value != null && !RealmObject.isManaged(value)) {
                value = ((Realm) proxyState.getRealm$realm()).copyToRealm(value);
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                // Table#nullifyLink() does not support default value. Just using Row.
                row.nullifyLink(columnInfo.sysIndex);
                return;
            }
            proxyState.checkValidObject(value);
            row.getTable().setLink(columnInfo.sysIndex, row.getIndex(), ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex(), true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().nullifyLink(columnInfo.sysIndex);
            return;
        }
        proxyState.checkValidObject(value);
        proxyState.getRow$realm().setLink(columnInfo.sysIndex, ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$dtTxt() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.dtTxtIndex);
    }

    @Override
    public void realmSet$dtTxt(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.dtTxtIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.dtTxtIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.dtTxtIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.dtTxtIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("ListWeathers", 7, 0);
        builder.addPersistedProperty("dt", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedLinkProperty("main", RealmFieldType.OBJECT, "Main");
        builder.addPersistedLinkProperty("weather", RealmFieldType.LIST, "Weather");
        builder.addPersistedLinkProperty("clouds", RealmFieldType.OBJECT, "Clouds");
        builder.addPersistedLinkProperty("wind", RealmFieldType.OBJECT, "Wind");
        builder.addPersistedLinkProperty("sys", RealmFieldType.OBJECT, "Sys");
        builder.addPersistedProperty("dtTxt", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static ListWeathersColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new ListWeathersColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "ListWeathers";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "ListWeathers";
    }

    @SuppressWarnings("cast")
    public static com.example.weatherowpandroid.model.ListWeathers createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(5);
        if (json.has("main")) {
            excludeFields.add("main");
        }
        if (json.has("weather")) {
            excludeFields.add("weather");
        }
        if (json.has("clouds")) {
            excludeFields.add("clouds");
        }
        if (json.has("wind")) {
            excludeFields.add("wind");
        }
        if (json.has("sys")) {
            excludeFields.add("sys");
        }
        com.example.weatherowpandroid.model.ListWeathers obj = realm.createObjectInternal(com.example.weatherowpandroid.model.ListWeathers.class, true, excludeFields);

        final com_example_weatherowpandroid_model_ListWeathersRealmProxyInterface objProxy = (com_example_weatherowpandroid_model_ListWeathersRealmProxyInterface) obj;
        if (json.has("dt")) {
            if (json.isNull("dt")) {
                objProxy.realmSet$dt(null);
            } else {
                objProxy.realmSet$dt((long) json.getLong("dt"));
            }
        }
        if (json.has("main")) {
            if (json.isNull("main")) {
                objProxy.realmSet$main(null);
            } else {
                com.example.weatherowpandroid.model.Main mainObj = com_example_weatherowpandroid_model_MainRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("main"), update);
                objProxy.realmSet$main(mainObj);
            }
        }
        if (json.has("weather")) {
            if (json.isNull("weather")) {
                objProxy.realmSet$weather(null);
            } else {
                objProxy.realmGet$weather().clear();
                JSONArray array = json.getJSONArray("weather");
                for (int i = 0; i < array.length(); i++) {
                    com.example.weatherowpandroid.model.Weather item = com_example_weatherowpandroid_model_WeatherRealmProxy.createOrUpdateUsingJsonObject(realm, array.getJSONObject(i), update);
                    objProxy.realmGet$weather().add(item);
                }
            }
        }
        if (json.has("clouds")) {
            if (json.isNull("clouds")) {
                objProxy.realmSet$clouds(null);
            } else {
                com.example.weatherowpandroid.model.Clouds cloudsObj = com_example_weatherowpandroid_model_CloudsRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("clouds"), update);
                objProxy.realmSet$clouds(cloudsObj);
            }
        }
        if (json.has("wind")) {
            if (json.isNull("wind")) {
                objProxy.realmSet$wind(null);
            } else {
                com.example.weatherowpandroid.model.Wind windObj = com_example_weatherowpandroid_model_WindRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("wind"), update);
                objProxy.realmSet$wind(windObj);
            }
        }
        if (json.has("sys")) {
            if (json.isNull("sys")) {
                objProxy.realmSet$sys(null);
            } else {
                com.example.weatherowpandroid.model.Sys sysObj = com_example_weatherowpandroid_model_SysRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("sys"), update);
                objProxy.realmSet$sys(sysObj);
            }
        }
        if (json.has("dtTxt")) {
            if (json.isNull("dtTxt")) {
                objProxy.realmSet$dtTxt(null);
            } else {
                objProxy.realmSet$dtTxt((String) json.getString("dtTxt"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.example.weatherowpandroid.model.ListWeathers createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.example.weatherowpandroid.model.ListWeathers obj = new com.example.weatherowpandroid.model.ListWeathers();
        final com_example_weatherowpandroid_model_ListWeathersRealmProxyInterface objProxy = (com_example_weatherowpandroid_model_ListWeathersRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("dt")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$dt((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$dt(null);
                }
            } else if (name.equals("main")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$main(null);
                } else {
                    com.example.weatherowpandroid.model.Main mainObj = com_example_weatherowpandroid_model_MainRealmProxy.createUsingJsonStream(realm, reader);
                    objProxy.realmSet$main(mainObj);
                }
            } else if (name.equals("weather")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$weather(null);
                } else {
                    objProxy.realmSet$weather(new RealmList<com.example.weatherowpandroid.model.Weather>());
                    reader.beginArray();
                    while (reader.hasNext()) {
                        com.example.weatherowpandroid.model.Weather item = com_example_weatherowpandroid_model_WeatherRealmProxy.createUsingJsonStream(realm, reader);
                        objProxy.realmGet$weather().add(item);
                    }
                    reader.endArray();
                }
            } else if (name.equals("clouds")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$clouds(null);
                } else {
                    com.example.weatherowpandroid.model.Clouds cloudsObj = com_example_weatherowpandroid_model_CloudsRealmProxy.createUsingJsonStream(realm, reader);
                    objProxy.realmSet$clouds(cloudsObj);
                }
            } else if (name.equals("wind")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$wind(null);
                } else {
                    com.example.weatherowpandroid.model.Wind windObj = com_example_weatherowpandroid_model_WindRealmProxy.createUsingJsonStream(realm, reader);
                    objProxy.realmSet$wind(windObj);
                }
            } else if (name.equals("sys")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$sys(null);
                } else {
                    com.example.weatherowpandroid.model.Sys sysObj = com_example_weatherowpandroid_model_SysRealmProxy.createUsingJsonStream(realm, reader);
                    objProxy.realmSet$sys(sysObj);
                }
            } else if (name.equals("dtTxt")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$dtTxt((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$dtTxt(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    public static com.example.weatherowpandroid.model.ListWeathers copyOrUpdate(Realm realm, com.example.weatherowpandroid.model.ListWeathers object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
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
            return (com.example.weatherowpandroid.model.ListWeathers) cachedRealmObject;
        }

        return copy(realm, object, update, cache);
    }

    public static com.example.weatherowpandroid.model.ListWeathers copy(Realm realm, com.example.weatherowpandroid.model.ListWeathers newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.example.weatherowpandroid.model.ListWeathers) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.example.weatherowpandroid.model.ListWeathers realmObject = realm.createObjectInternal(com.example.weatherowpandroid.model.ListWeathers.class, false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        com_example_weatherowpandroid_model_ListWeathersRealmProxyInterface realmObjectSource = (com_example_weatherowpandroid_model_ListWeathersRealmProxyInterface) newObject;
        com_example_weatherowpandroid_model_ListWeathersRealmProxyInterface realmObjectCopy = (com_example_weatherowpandroid_model_ListWeathersRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$dt(realmObjectSource.realmGet$dt());

        com.example.weatherowpandroid.model.Main mainObj = realmObjectSource.realmGet$main();
        if (mainObj == null) {
            realmObjectCopy.realmSet$main(null);
        } else {
            com.example.weatherowpandroid.model.Main cachemain = (com.example.weatherowpandroid.model.Main) cache.get(mainObj);
            if (cachemain != null) {
                realmObjectCopy.realmSet$main(cachemain);
            } else {
                realmObjectCopy.realmSet$main(com_example_weatherowpandroid_model_MainRealmProxy.copyOrUpdate(realm, mainObj, update, cache));
            }
        }

        RealmList<com.example.weatherowpandroid.model.Weather> weatherList = realmObjectSource.realmGet$weather();
        if (weatherList != null) {
            RealmList<com.example.weatherowpandroid.model.Weather> weatherRealmList = realmObjectCopy.realmGet$weather();
            weatherRealmList.clear();
            for (int i = 0; i < weatherList.size(); i++) {
                com.example.weatherowpandroid.model.Weather weatherItem = weatherList.get(i);
                com.example.weatherowpandroid.model.Weather cacheweather = (com.example.weatherowpandroid.model.Weather) cache.get(weatherItem);
                if (cacheweather != null) {
                    weatherRealmList.add(cacheweather);
                } else {
                    weatherRealmList.add(com_example_weatherowpandroid_model_WeatherRealmProxy.copyOrUpdate(realm, weatherItem, update, cache));
                }
            }
        }


        com.example.weatherowpandroid.model.Clouds cloudsObj = realmObjectSource.realmGet$clouds();
        if (cloudsObj == null) {
            realmObjectCopy.realmSet$clouds(null);
        } else {
            com.example.weatherowpandroid.model.Clouds cacheclouds = (com.example.weatherowpandroid.model.Clouds) cache.get(cloudsObj);
            if (cacheclouds != null) {
                realmObjectCopy.realmSet$clouds(cacheclouds);
            } else {
                realmObjectCopy.realmSet$clouds(com_example_weatherowpandroid_model_CloudsRealmProxy.copyOrUpdate(realm, cloudsObj, update, cache));
            }
        }

        com.example.weatherowpandroid.model.Wind windObj = realmObjectSource.realmGet$wind();
        if (windObj == null) {
            realmObjectCopy.realmSet$wind(null);
        } else {
            com.example.weatherowpandroid.model.Wind cachewind = (com.example.weatherowpandroid.model.Wind) cache.get(windObj);
            if (cachewind != null) {
                realmObjectCopy.realmSet$wind(cachewind);
            } else {
                realmObjectCopy.realmSet$wind(com_example_weatherowpandroid_model_WindRealmProxy.copyOrUpdate(realm, windObj, update, cache));
            }
        }

        com.example.weatherowpandroid.model.Sys sysObj = realmObjectSource.realmGet$sys();
        if (sysObj == null) {
            realmObjectCopy.realmSet$sys(null);
        } else {
            com.example.weatherowpandroid.model.Sys cachesys = (com.example.weatherowpandroid.model.Sys) cache.get(sysObj);
            if (cachesys != null) {
                realmObjectCopy.realmSet$sys(cachesys);
            } else {
                realmObjectCopy.realmSet$sys(com_example_weatherowpandroid_model_SysRealmProxy.copyOrUpdate(realm, sysObj, update, cache));
            }
        }
        realmObjectCopy.realmSet$dtTxt(realmObjectSource.realmGet$dtTxt());
        return realmObject;
    }

    public static long insert(Realm realm, com.example.weatherowpandroid.model.ListWeathers object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.example.weatherowpandroid.model.ListWeathers.class);
        long tableNativePtr = table.getNativePtr();
        ListWeathersColumnInfo columnInfo = (ListWeathersColumnInfo) realm.getSchema().getColumnInfo(com.example.weatherowpandroid.model.ListWeathers.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        Number realmGet$dt = ((com_example_weatherowpandroid_model_ListWeathersRealmProxyInterface) object).realmGet$dt();
        if (realmGet$dt != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.dtIndex, rowIndex, realmGet$dt.longValue(), false);
        }

        com.example.weatherowpandroid.model.Main mainObj = ((com_example_weatherowpandroid_model_ListWeathersRealmProxyInterface) object).realmGet$main();
        if (mainObj != null) {
            Long cachemain = cache.get(mainObj);
            if (cachemain == null) {
                cachemain = com_example_weatherowpandroid_model_MainRealmProxy.insert(realm, mainObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.mainIndex, rowIndex, cachemain, false);
        }

        RealmList<com.example.weatherowpandroid.model.Weather> weatherList = ((com_example_weatherowpandroid_model_ListWeathersRealmProxyInterface) object).realmGet$weather();
        if (weatherList != null) {
            OsList weatherOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.weatherIndex);
            for (com.example.weatherowpandroid.model.Weather weatherItem : weatherList) {
                Long cacheItemIndexweather = cache.get(weatherItem);
                if (cacheItemIndexweather == null) {
                    cacheItemIndexweather = com_example_weatherowpandroid_model_WeatherRealmProxy.insert(realm, weatherItem, cache);
                }
                weatherOsList.addRow(cacheItemIndexweather);
            }
        }

        com.example.weatherowpandroid.model.Clouds cloudsObj = ((com_example_weatherowpandroid_model_ListWeathersRealmProxyInterface) object).realmGet$clouds();
        if (cloudsObj != null) {
            Long cacheclouds = cache.get(cloudsObj);
            if (cacheclouds == null) {
                cacheclouds = com_example_weatherowpandroid_model_CloudsRealmProxy.insert(realm, cloudsObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.cloudsIndex, rowIndex, cacheclouds, false);
        }

        com.example.weatherowpandroid.model.Wind windObj = ((com_example_weatherowpandroid_model_ListWeathersRealmProxyInterface) object).realmGet$wind();
        if (windObj != null) {
            Long cachewind = cache.get(windObj);
            if (cachewind == null) {
                cachewind = com_example_weatherowpandroid_model_WindRealmProxy.insert(realm, windObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.windIndex, rowIndex, cachewind, false);
        }

        com.example.weatherowpandroid.model.Sys sysObj = ((com_example_weatherowpandroid_model_ListWeathersRealmProxyInterface) object).realmGet$sys();
        if (sysObj != null) {
            Long cachesys = cache.get(sysObj);
            if (cachesys == null) {
                cachesys = com_example_weatherowpandroid_model_SysRealmProxy.insert(realm, sysObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.sysIndex, rowIndex, cachesys, false);
        }
        String realmGet$dtTxt = ((com_example_weatherowpandroid_model_ListWeathersRealmProxyInterface) object).realmGet$dtTxt();
        if (realmGet$dtTxt != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.dtTxtIndex, rowIndex, realmGet$dtTxt, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.example.weatherowpandroid.model.ListWeathers.class);
        long tableNativePtr = table.getNativePtr();
        ListWeathersColumnInfo columnInfo = (ListWeathersColumnInfo) realm.getSchema().getColumnInfo(com.example.weatherowpandroid.model.ListWeathers.class);
        com.example.weatherowpandroid.model.ListWeathers object = null;
        while (objects.hasNext()) {
            object = (com.example.weatherowpandroid.model.ListWeathers) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            Number realmGet$dt = ((com_example_weatherowpandroid_model_ListWeathersRealmProxyInterface) object).realmGet$dt();
            if (realmGet$dt != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.dtIndex, rowIndex, realmGet$dt.longValue(), false);
            }

            com.example.weatherowpandroid.model.Main mainObj = ((com_example_weatherowpandroid_model_ListWeathersRealmProxyInterface) object).realmGet$main();
            if (mainObj != null) {
                Long cachemain = cache.get(mainObj);
                if (cachemain == null) {
                    cachemain = com_example_weatherowpandroid_model_MainRealmProxy.insert(realm, mainObj, cache);
                }
                table.setLink(columnInfo.mainIndex, rowIndex, cachemain, false);
            }

            RealmList<com.example.weatherowpandroid.model.Weather> weatherList = ((com_example_weatherowpandroid_model_ListWeathersRealmProxyInterface) object).realmGet$weather();
            if (weatherList != null) {
                OsList weatherOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.weatherIndex);
                for (com.example.weatherowpandroid.model.Weather weatherItem : weatherList) {
                    Long cacheItemIndexweather = cache.get(weatherItem);
                    if (cacheItemIndexweather == null) {
                        cacheItemIndexweather = com_example_weatherowpandroid_model_WeatherRealmProxy.insert(realm, weatherItem, cache);
                    }
                    weatherOsList.addRow(cacheItemIndexweather);
                }
            }

            com.example.weatherowpandroid.model.Clouds cloudsObj = ((com_example_weatherowpandroid_model_ListWeathersRealmProxyInterface) object).realmGet$clouds();
            if (cloudsObj != null) {
                Long cacheclouds = cache.get(cloudsObj);
                if (cacheclouds == null) {
                    cacheclouds = com_example_weatherowpandroid_model_CloudsRealmProxy.insert(realm, cloudsObj, cache);
                }
                table.setLink(columnInfo.cloudsIndex, rowIndex, cacheclouds, false);
            }

            com.example.weatherowpandroid.model.Wind windObj = ((com_example_weatherowpandroid_model_ListWeathersRealmProxyInterface) object).realmGet$wind();
            if (windObj != null) {
                Long cachewind = cache.get(windObj);
                if (cachewind == null) {
                    cachewind = com_example_weatherowpandroid_model_WindRealmProxy.insert(realm, windObj, cache);
                }
                table.setLink(columnInfo.windIndex, rowIndex, cachewind, false);
            }

            com.example.weatherowpandroid.model.Sys sysObj = ((com_example_weatherowpandroid_model_ListWeathersRealmProxyInterface) object).realmGet$sys();
            if (sysObj != null) {
                Long cachesys = cache.get(sysObj);
                if (cachesys == null) {
                    cachesys = com_example_weatherowpandroid_model_SysRealmProxy.insert(realm, sysObj, cache);
                }
                table.setLink(columnInfo.sysIndex, rowIndex, cachesys, false);
            }
            String realmGet$dtTxt = ((com_example_weatherowpandroid_model_ListWeathersRealmProxyInterface) object).realmGet$dtTxt();
            if (realmGet$dtTxt != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.dtTxtIndex, rowIndex, realmGet$dtTxt, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.example.weatherowpandroid.model.ListWeathers object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.example.weatherowpandroid.model.ListWeathers.class);
        long tableNativePtr = table.getNativePtr();
        ListWeathersColumnInfo columnInfo = (ListWeathersColumnInfo) realm.getSchema().getColumnInfo(com.example.weatherowpandroid.model.ListWeathers.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        Number realmGet$dt = ((com_example_weatherowpandroid_model_ListWeathersRealmProxyInterface) object).realmGet$dt();
        if (realmGet$dt != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.dtIndex, rowIndex, realmGet$dt.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.dtIndex, rowIndex, false);
        }

        com.example.weatherowpandroid.model.Main mainObj = ((com_example_weatherowpandroid_model_ListWeathersRealmProxyInterface) object).realmGet$main();
        if (mainObj != null) {
            Long cachemain = cache.get(mainObj);
            if (cachemain == null) {
                cachemain = com_example_weatherowpandroid_model_MainRealmProxy.insertOrUpdate(realm, mainObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.mainIndex, rowIndex, cachemain, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.mainIndex, rowIndex);
        }

        OsList weatherOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.weatherIndex);
        RealmList<com.example.weatherowpandroid.model.Weather> weatherList = ((com_example_weatherowpandroid_model_ListWeathersRealmProxyInterface) object).realmGet$weather();
        if (weatherList != null && weatherList.size() == weatherOsList.size()) {
            // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
            int objects = weatherList.size();
            for (int i = 0; i < objects; i++) {
                com.example.weatherowpandroid.model.Weather weatherItem = weatherList.get(i);
                Long cacheItemIndexweather = cache.get(weatherItem);
                if (cacheItemIndexweather == null) {
                    cacheItemIndexweather = com_example_weatherowpandroid_model_WeatherRealmProxy.insertOrUpdate(realm, weatherItem, cache);
                }
                weatherOsList.setRow(i, cacheItemIndexweather);
            }
        } else {
            weatherOsList.removeAll();
            if (weatherList != null) {
                for (com.example.weatherowpandroid.model.Weather weatherItem : weatherList) {
                    Long cacheItemIndexweather = cache.get(weatherItem);
                    if (cacheItemIndexweather == null) {
                        cacheItemIndexweather = com_example_weatherowpandroid_model_WeatherRealmProxy.insertOrUpdate(realm, weatherItem, cache);
                    }
                    weatherOsList.addRow(cacheItemIndexweather);
                }
            }
        }


        com.example.weatherowpandroid.model.Clouds cloudsObj = ((com_example_weatherowpandroid_model_ListWeathersRealmProxyInterface) object).realmGet$clouds();
        if (cloudsObj != null) {
            Long cacheclouds = cache.get(cloudsObj);
            if (cacheclouds == null) {
                cacheclouds = com_example_weatherowpandroid_model_CloudsRealmProxy.insertOrUpdate(realm, cloudsObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.cloudsIndex, rowIndex, cacheclouds, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.cloudsIndex, rowIndex);
        }

        com.example.weatherowpandroid.model.Wind windObj = ((com_example_weatherowpandroid_model_ListWeathersRealmProxyInterface) object).realmGet$wind();
        if (windObj != null) {
            Long cachewind = cache.get(windObj);
            if (cachewind == null) {
                cachewind = com_example_weatherowpandroid_model_WindRealmProxy.insertOrUpdate(realm, windObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.windIndex, rowIndex, cachewind, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.windIndex, rowIndex);
        }

        com.example.weatherowpandroid.model.Sys sysObj = ((com_example_weatherowpandroid_model_ListWeathersRealmProxyInterface) object).realmGet$sys();
        if (sysObj != null) {
            Long cachesys = cache.get(sysObj);
            if (cachesys == null) {
                cachesys = com_example_weatherowpandroid_model_SysRealmProxy.insertOrUpdate(realm, sysObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.sysIndex, rowIndex, cachesys, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.sysIndex, rowIndex);
        }
        String realmGet$dtTxt = ((com_example_weatherowpandroid_model_ListWeathersRealmProxyInterface) object).realmGet$dtTxt();
        if (realmGet$dtTxt != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.dtTxtIndex, rowIndex, realmGet$dtTxt, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.dtTxtIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.example.weatherowpandroid.model.ListWeathers.class);
        long tableNativePtr = table.getNativePtr();
        ListWeathersColumnInfo columnInfo = (ListWeathersColumnInfo) realm.getSchema().getColumnInfo(com.example.weatherowpandroid.model.ListWeathers.class);
        com.example.weatherowpandroid.model.ListWeathers object = null;
        while (objects.hasNext()) {
            object = (com.example.weatherowpandroid.model.ListWeathers) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            Number realmGet$dt = ((com_example_weatherowpandroid_model_ListWeathersRealmProxyInterface) object).realmGet$dt();
            if (realmGet$dt != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.dtIndex, rowIndex, realmGet$dt.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.dtIndex, rowIndex, false);
            }

            com.example.weatherowpandroid.model.Main mainObj = ((com_example_weatherowpandroid_model_ListWeathersRealmProxyInterface) object).realmGet$main();
            if (mainObj != null) {
                Long cachemain = cache.get(mainObj);
                if (cachemain == null) {
                    cachemain = com_example_weatherowpandroid_model_MainRealmProxy.insertOrUpdate(realm, mainObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.mainIndex, rowIndex, cachemain, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.mainIndex, rowIndex);
            }

            OsList weatherOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.weatherIndex);
            RealmList<com.example.weatherowpandroid.model.Weather> weatherList = ((com_example_weatherowpandroid_model_ListWeathersRealmProxyInterface) object).realmGet$weather();
            if (weatherList != null && weatherList.size() == weatherOsList.size()) {
                // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
                int objectCount = weatherList.size();
                for (int i = 0; i < objectCount; i++) {
                    com.example.weatherowpandroid.model.Weather weatherItem = weatherList.get(i);
                    Long cacheItemIndexweather = cache.get(weatherItem);
                    if (cacheItemIndexweather == null) {
                        cacheItemIndexweather = com_example_weatherowpandroid_model_WeatherRealmProxy.insertOrUpdate(realm, weatherItem, cache);
                    }
                    weatherOsList.setRow(i, cacheItemIndexweather);
                }
            } else {
                weatherOsList.removeAll();
                if (weatherList != null) {
                    for (com.example.weatherowpandroid.model.Weather weatherItem : weatherList) {
                        Long cacheItemIndexweather = cache.get(weatherItem);
                        if (cacheItemIndexweather == null) {
                            cacheItemIndexweather = com_example_weatherowpandroid_model_WeatherRealmProxy.insertOrUpdate(realm, weatherItem, cache);
                        }
                        weatherOsList.addRow(cacheItemIndexweather);
                    }
                }
            }


            com.example.weatherowpandroid.model.Clouds cloudsObj = ((com_example_weatherowpandroid_model_ListWeathersRealmProxyInterface) object).realmGet$clouds();
            if (cloudsObj != null) {
                Long cacheclouds = cache.get(cloudsObj);
                if (cacheclouds == null) {
                    cacheclouds = com_example_weatherowpandroid_model_CloudsRealmProxy.insertOrUpdate(realm, cloudsObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.cloudsIndex, rowIndex, cacheclouds, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.cloudsIndex, rowIndex);
            }

            com.example.weatherowpandroid.model.Wind windObj = ((com_example_weatherowpandroid_model_ListWeathersRealmProxyInterface) object).realmGet$wind();
            if (windObj != null) {
                Long cachewind = cache.get(windObj);
                if (cachewind == null) {
                    cachewind = com_example_weatherowpandroid_model_WindRealmProxy.insertOrUpdate(realm, windObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.windIndex, rowIndex, cachewind, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.windIndex, rowIndex);
            }

            com.example.weatherowpandroid.model.Sys sysObj = ((com_example_weatherowpandroid_model_ListWeathersRealmProxyInterface) object).realmGet$sys();
            if (sysObj != null) {
                Long cachesys = cache.get(sysObj);
                if (cachesys == null) {
                    cachesys = com_example_weatherowpandroid_model_SysRealmProxy.insertOrUpdate(realm, sysObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.sysIndex, rowIndex, cachesys, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.sysIndex, rowIndex);
            }
            String realmGet$dtTxt = ((com_example_weatherowpandroid_model_ListWeathersRealmProxyInterface) object).realmGet$dtTxt();
            if (realmGet$dtTxt != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.dtTxtIndex, rowIndex, realmGet$dtTxt, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.dtTxtIndex, rowIndex, false);
            }
        }
    }

    public static com.example.weatherowpandroid.model.ListWeathers createDetachedCopy(com.example.weatherowpandroid.model.ListWeathers realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.example.weatherowpandroid.model.ListWeathers unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.example.weatherowpandroid.model.ListWeathers();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.example.weatherowpandroid.model.ListWeathers) cachedObject.object;
            }
            unmanagedObject = (com.example.weatherowpandroid.model.ListWeathers) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_example_weatherowpandroid_model_ListWeathersRealmProxyInterface unmanagedCopy = (com_example_weatherowpandroid_model_ListWeathersRealmProxyInterface) unmanagedObject;
        com_example_weatherowpandroid_model_ListWeathersRealmProxyInterface realmSource = (com_example_weatherowpandroid_model_ListWeathersRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$dt(realmSource.realmGet$dt());

        // Deep copy of main
        unmanagedCopy.realmSet$main(com_example_weatherowpandroid_model_MainRealmProxy.createDetachedCopy(realmSource.realmGet$main(), currentDepth + 1, maxDepth, cache));

        // Deep copy of weather
        if (currentDepth == maxDepth) {
            unmanagedCopy.realmSet$weather(null);
        } else {
            RealmList<com.example.weatherowpandroid.model.Weather> managedweatherList = realmSource.realmGet$weather();
            RealmList<com.example.weatherowpandroid.model.Weather> unmanagedweatherList = new RealmList<com.example.weatherowpandroid.model.Weather>();
            unmanagedCopy.realmSet$weather(unmanagedweatherList);
            int nextDepth = currentDepth + 1;
            int size = managedweatherList.size();
            for (int i = 0; i < size; i++) {
                com.example.weatherowpandroid.model.Weather item = com_example_weatherowpandroid_model_WeatherRealmProxy.createDetachedCopy(managedweatherList.get(i), nextDepth, maxDepth, cache);
                unmanagedweatherList.add(item);
            }
        }

        // Deep copy of clouds
        unmanagedCopy.realmSet$clouds(com_example_weatherowpandroid_model_CloudsRealmProxy.createDetachedCopy(realmSource.realmGet$clouds(), currentDepth + 1, maxDepth, cache));

        // Deep copy of wind
        unmanagedCopy.realmSet$wind(com_example_weatherowpandroid_model_WindRealmProxy.createDetachedCopy(realmSource.realmGet$wind(), currentDepth + 1, maxDepth, cache));

        // Deep copy of sys
        unmanagedCopy.realmSet$sys(com_example_weatherowpandroid_model_SysRealmProxy.createDetachedCopy(realmSource.realmGet$sys(), currentDepth + 1, maxDepth, cache));
        unmanagedCopy.realmSet$dtTxt(realmSource.realmGet$dtTxt());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("ListWeathers = proxy[");
        stringBuilder.append("{dt:");
        stringBuilder.append(realmGet$dt() != null ? realmGet$dt() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{main:");
        stringBuilder.append(realmGet$main() != null ? "Main" : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{weather:");
        stringBuilder.append("RealmList<Weather>[").append(realmGet$weather().size()).append("]");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{clouds:");
        stringBuilder.append(realmGet$clouds() != null ? "Clouds" : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{wind:");
        stringBuilder.append(realmGet$wind() != null ? "Wind" : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{sys:");
        stringBuilder.append(realmGet$sys() != null ? "Sys" : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{dtTxt:");
        stringBuilder.append(realmGet$dtTxt() != null ? realmGet$dtTxt() : "null");
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
        com_example_weatherowpandroid_model_ListWeathersRealmProxy aListWeathers = (com_example_weatherowpandroid_model_ListWeathersRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aListWeathers.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aListWeathers.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aListWeathers.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
