package tbclient.GetPoisByLocation;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class DataRes extends Message {
    public static final String DEFAULT_FORMATTED_ADDRESS = "";
    public static final List<PoiInfo> DEFAULT_POI_INFO = Collections.emptyList();

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String formatted_address;

    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<PoiInfo> poi_info;

    public static final class Builder extends Message.Builder<DataRes> {
        public String formatted_address;
        public List<PoiInfo> poi_info;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.formatted_address = dataRes.formatted_address;
            this.poi_info = Message.copyOf(dataRes.poi_info);
        }

        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.formatted_address;
            if (str == null) {
                this.formatted_address = "";
            } else {
                this.formatted_address = str;
            }
            List<PoiInfo> list = builder.poi_info;
            if (list == null) {
                this.poi_info = DEFAULT_POI_INFO;
                return;
            } else {
                this.poi_info = Message.immutableCopyOf(list);
                return;
            }
        }
        this.formatted_address = builder.formatted_address;
        this.poi_info = Message.immutableCopyOf(builder.poi_info);
    }
}