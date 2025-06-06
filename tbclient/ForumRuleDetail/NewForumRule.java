package tbclient.ForumRuleDetail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class NewForumRule extends Message {
    public static final List<NewRuleContent> DEFAULT_CONTENT_LIST = Collections.emptyList();
    public static final String DEFAULT_TITLE = "";

    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<NewRuleContent> content_list;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;

    public static final class Builder extends Message.Builder<NewForumRule> {
        public List<NewRuleContent> content_list;
        public String title;

        public Builder() {
        }

        public Builder(NewForumRule newForumRule) {
            super(newForumRule);
            if (newForumRule == null) {
                return;
            }
            this.title = newForumRule.title;
            this.content_list = Message.copyOf(newForumRule.content_list);
        }

        @Override // com.squareup.wire.Message.Builder
        public NewForumRule build(boolean z) {
            return new NewForumRule(this, z);
        }
    }

    public NewForumRule(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            List<NewRuleContent> list = builder.content_list;
            if (list == null) {
                this.content_list = DEFAULT_CONTENT_LIST;
                return;
            } else {
                this.content_list = Message.immutableCopyOf(list);
                return;
            }
        }
        this.title = builder.title;
        this.content_list = Message.immutableCopyOf(builder.content_list);
    }
}