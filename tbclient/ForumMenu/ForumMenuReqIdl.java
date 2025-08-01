package tbclient.ForumMenu;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class ForumMenuReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<ForumMenuReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(ForumMenuReqIdl forumMenuReqIdl) {
            super(forumMenuReqIdl);
            if (forumMenuReqIdl == null) {
                return;
            }
            this.data = forumMenuReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public ForumMenuReqIdl build(boolean z) {
            return new ForumMenuReqIdl(this, z);
        }
    }

    public ForumMenuReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}