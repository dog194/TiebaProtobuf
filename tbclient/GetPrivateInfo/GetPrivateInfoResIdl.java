package tbclient.GetPrivateInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class GetPrivateInfoResIdl extends Message {

    @ProtoField(tag = 1)
    public final ResData data;

    @ProtoField(tag = 2)
    public final Error error;

    public static final class Builder extends Message.Builder<GetPrivateInfoResIdl> {
        public ResData data;
        public Error error;

        public Builder() {
        }

        public Builder(GetPrivateInfoResIdl getPrivateInfoResIdl) {
            super(getPrivateInfoResIdl);
            if (getPrivateInfoResIdl == null) {
                return;
            }
            this.data = getPrivateInfoResIdl.data;
            this.error = getPrivateInfoResIdl.error;
        }

        @Override // com.squareup.wire.Message.Builder
        public GetPrivateInfoResIdl build(boolean z) {
            return new GetPrivateInfoResIdl(this, z);
        }
    }

    public GetPrivateInfoResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
            this.error = builder.error;
        } else {
            this.data = builder.data;
            this.error = builder.error;
        }
    }
}