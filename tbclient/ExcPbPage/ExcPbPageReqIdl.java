package tbclient.ExcPbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class ExcPbPageReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<ExcPbPageReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(ExcPbPageReqIdl excPbPageReqIdl) {
            super(excPbPageReqIdl);
            if (excPbPageReqIdl == null) {
                return;
            }
            this.data = excPbPageReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public ExcPbPageReqIdl build(boolean z) {
            return new ExcPbPageReqIdl(this, z);
        }
    }

    public ExcPbPageReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}