package tbclient.GetSuggestionByAddrName;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.Lbs;

/* loaded from: classes4.dex */
public final class DataRes extends Message {
    public static final List<Lbs> DEFAULT_POI_INFO = Collections.emptyList();

    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<Lbs> poi_info;

    public static final class Builder extends Message.Builder<DataRes> {
        public List<Lbs> poi_info;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
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
            List<Lbs> list = builder.poi_info;
            if (list == null) {
                this.poi_info = DEFAULT_POI_INFO;
                return;
            } else {
                this.poi_info = Message.immutableCopyOf(list);
                return;
            }
        }
        this.poi_info = Message.immutableCopyOf(builder.poi_info);
    }
}