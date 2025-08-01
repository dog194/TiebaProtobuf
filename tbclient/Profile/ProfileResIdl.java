package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class ProfileResIdl extends Message {

    @ProtoField(tag = 2)
    public final DataRes data;

    @ProtoField(tag = 1)
    public final Error error;

    public static final class Builder extends Message.Builder<ProfileResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(ProfileResIdl profileResIdl) {
            super(profileResIdl);
            if (profileResIdl == null) {
                return;
            }
            this.error = profileResIdl.error;
            this.data = profileResIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public ProfileResIdl build(boolean z) {
            return new ProfileResIdl(this, z);
        }
    }

    public ProfileResIdl(Builder builder, boolean z) {
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