package tbclient.ForumRuleDetail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.PbContent;

/* loaded from: classes4.dex */
public final class NewRuleContent extends Message {
    public static final List<PbContent> DEFAULT_CONTENT = Collections.emptyList();

    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<PbContent> content;

    public static final class Builder extends Message.Builder<NewRuleContent> {
        public List<PbContent> content;

        public Builder() {
        }

        public Builder(NewRuleContent newRuleContent) {
            super(newRuleContent);
            if (newRuleContent == null) {
                return;
            }
            this.content = Message.copyOf(newRuleContent.content);
        }

        @Override // com.squareup.wire.Message.Builder
        public NewRuleContent build(boolean z) {
            return new NewRuleContent(this, z);
        }
    }

    public NewRuleContent(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<PbContent> list = builder.content;
            if (list == null) {
                this.content = DEFAULT_CONTENT;
                return;
            } else {
                this.content = Message.immutableCopyOf(list);
                return;
            }
        }
        this.content = Message.immutableCopyOf(builder.content);
    }
}