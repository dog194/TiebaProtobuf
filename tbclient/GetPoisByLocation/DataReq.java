package tbclient.GetPoisByLocation;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

/* loaded from: classes4.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_LAT = "";
    public static final String DEFAULT_LNG = "";

    /* renamed from: common, reason: collision with root package name */
    @ProtoField(tag = 3)
    public final CommonReq f1431common;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String lat;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String lng;

    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common, reason: collision with root package name */
        public CommonReq f1432common;
        public String lat;
        public String lng;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.lat = dataReq.lat;
            this.lng = dataReq.lng;
            this.f1432common = dataReq.f1431common;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.lat;
            if (str == null) {
                this.lat = "";
            } else {
                this.lat = str;
            }
            String str2 = builder.lng;
            if (str2 == null) {
                this.lng = "";
            } else {
                this.lng = str2;
            }
            this.f1431common = builder.f1432common;
            return;
        }
        this.lat = builder.lat;
        this.lng = builder.lng;
        this.f1431common = builder.f1432common;
    }
}