package tbclient.ForumRuleDetail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class ForumRuleDetailResIdl extends Message {

    @ProtoField(tag = 2)
    public final DataRes data;

    @ProtoField(tag = 1)
    public final Error error;

    public static final class Builder extends Message.Builder<ForumRuleDetailResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(ForumRuleDetailResIdl forumRuleDetailResIdl) {
            super(forumRuleDetailResIdl);
            if (forumRuleDetailResIdl == null) {
                return;
            }
            this.error = forumRuleDetailResIdl.error;
            this.data = forumRuleDetailResIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public ForumRuleDetailResIdl build(boolean z) {
            return new ForumRuleDetailResIdl(this, z);
        }
    }

    public ForumRuleDetailResIdl(Builder builder, boolean z) {
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