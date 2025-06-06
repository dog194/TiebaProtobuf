package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class UserIconExtAttr extends Message {
    public static final String DEFAULT_KEY = "";
    public static final String DEFAULT_VALUE = "";

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String key;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String value;

    public static final class Builder extends Message.Builder<UserIconExtAttr> {
        public String key;
        public String value;

        public Builder() {
        }

        public Builder(UserIconExtAttr userIconExtAttr) {
            super(userIconExtAttr);
            if (userIconExtAttr == null) {
                return;
            }
            this.key = userIconExtAttr.key;
            this.value = userIconExtAttr.value;
        }

        @Override // com.squareup.wire.Message.Builder
        public UserIconExtAttr build(boolean z) {
            return new UserIconExtAttr(this, z);
        }
    }

    public UserIconExtAttr(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.key;
            if (str == null) {
                this.key = "";
            } else {
                this.key = str;
            }
            String str2 = builder.value;
            if (str2 == null) {
                this.value = "";
                return;
            } else {
                this.value = str2;
                return;
            }
        }
        this.key = builder.key;
        this.value = builder.value;
    }
}