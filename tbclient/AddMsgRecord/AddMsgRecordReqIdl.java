package tbclient.AddMsgRecord;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class AddMsgRecordReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<AddMsgRecordReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(AddMsgRecordReqIdl addMsgRecordReqIdl) {
            super(addMsgRecordReqIdl);
            if (addMsgRecordReqIdl == null) {
                return;
            }
            this.data = addMsgRecordReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public AddMsgRecordReqIdl build(boolean z) {
            return new AddMsgRecordReqIdl(this, z);
        }
    }

    public AddMsgRecordReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}