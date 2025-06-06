package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class QuestionCard extends Message {
    public static final List<ComponentFactory> DEFAULT_COMPONENTS = Collections.emptyList();
    public static final List<FeedKV> DEFAULT_LOG_PARAM = Collections.emptyList();

    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ComponentFactory> components;

    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<FeedKV> log_param;

    public static final class Builder extends Message.Builder<QuestionCard> {
        public List<ComponentFactory> components;
        public List<FeedKV> log_param;

        public Builder() {
        }

        public Builder(QuestionCard questionCard) {
            super(questionCard);
            if (questionCard == null) {
                return;
            }
            this.components = Message.copyOf(questionCard.components);
            this.log_param = Message.copyOf(questionCard.log_param);
        }

        @Override // com.squareup.wire.Message.Builder
        public QuestionCard build(boolean z) {
            return new QuestionCard(this, z);
        }
    }

    public QuestionCard(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<ComponentFactory> list = builder.components;
            if (list == null) {
                this.components = DEFAULT_COMPONENTS;
            } else {
                this.components = Message.immutableCopyOf(list);
            }
            List<FeedKV> list2 = builder.log_param;
            if (list2 == null) {
                this.log_param = DEFAULT_LOG_PARAM;
                return;
            } else {
                this.log_param = Message.immutableCopyOf(list2);
                return;
            }
        }
        this.components = Message.immutableCopyOf(builder.components);
        this.log_param = Message.immutableCopyOf(builder.log_param);
    }
}