package tbclient.GeneralTabList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class GeneralTabListReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<GeneralTabListReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GeneralTabListReqIdl generalTabListReqIdl) {
            super(generalTabListReqIdl);
            if (generalTabListReqIdl == null) {
                return;
            }
            this.data = generalTabListReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public GeneralTabListReqIdl build(boolean z) {
            return new GeneralTabListReqIdl(this, z);
        }
    }

    public GeneralTabListReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}