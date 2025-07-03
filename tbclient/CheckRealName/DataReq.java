package tbclient.CheckRealName;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

/* loaded from: classes4.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_OBJ_SOURCE = "";

    /* renamed from: common, reason: collision with root package name */
    @ProtoField(tag = 1)
    public final CommonReq f1337common;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String obj_source;

    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common, reason: collision with root package name */
        public CommonReq f1338common;
        public String obj_source;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1338common = dataReq.f1337common;
            this.obj_source = dataReq.obj_source;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1337common = builder.f1338common;
            String str = builder.obj_source;
            if (str == null) {
                this.obj_source = "";
                return;
            } else {
                this.obj_source = str;
                return;
            }
        }
        this.f1337common = builder.f1338common;
        this.obj_source = builder.obj_source;
    }
}