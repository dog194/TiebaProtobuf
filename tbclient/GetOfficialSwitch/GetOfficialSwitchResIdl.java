package tbclient.GetOfficialSwitch;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class GetOfficialSwitchResIdl extends Message {

    @ProtoField(tag = 2)
    public final DataRes data;

    @ProtoField(tag = 1)
    public final Error error;

    public static final class Builder extends Message.Builder<GetOfficialSwitchResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetOfficialSwitchResIdl getOfficialSwitchResIdl) {
            super(getOfficialSwitchResIdl);
            if (getOfficialSwitchResIdl == null) {
                return;
            }
            this.error = getOfficialSwitchResIdl.error;
            this.data = getOfficialSwitchResIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public GetOfficialSwitchResIdl build(boolean z) {
            return new GetOfficialSwitchResIdl(this, z);
        }
    }

    public GetOfficialSwitchResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
        } else {
            this.error = builder.error;
            this.data = builder.data;
        }
    }
}