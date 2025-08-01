package tbclient.GetStoreRemindTime;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class GetStoreRemindTimeReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<GetStoreRemindTimeReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetStoreRemindTimeReqIdl getStoreRemindTimeReqIdl) {
            super(getStoreRemindTimeReqIdl);
            if (getStoreRemindTimeReqIdl == null) {
                return;
            }
            this.data = getStoreRemindTimeReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public GetStoreRemindTimeReqIdl build(boolean z) {
            return new GetStoreRemindTimeReqIdl(this, z);
        }
    }

    public GetStoreRemindTimeReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}