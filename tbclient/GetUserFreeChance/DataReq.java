package tbclient.GetUserFreeChance;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

/* loaded from: classes4.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_SCENE_FROM = "";

    /* renamed from: common, reason: collision with root package name */
    @ProtoField(tag = 1)
    public final CommonReq f1460common;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String scene_from;

    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common, reason: collision with root package name */
        public CommonReq f1461common;
        public String scene_from;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1461common = dataReq.f1460common;
            this.scene_from = dataReq.scene_from;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1460common = builder.f1461common;
            String str = builder.scene_from;
            if (str == null) {
                this.scene_from = "";
                return;
            } else {
                this.scene_from = str;
                return;
            }
        }
        this.f1460common = builder.f1461common;
        this.scene_from = builder.scene_from;
    }
}