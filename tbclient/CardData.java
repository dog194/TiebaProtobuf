package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class CardData extends Message {
    public static final List<SimpleForum> DEFAULT_FORUM_LIST = Collections.emptyList();
    public static final List<RecomTopicList> DEFAULT_TOPIC_LIST = Collections.emptyList();

    @ProtoField(tag = 4)
    public final AiInteractiveGamePlot ai_interactive_game_plot;

    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<SimpleForum> forum_list;

    @ProtoField(tag = 1)
    public final ThreadInfo thread_info;

    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<RecomTopicList> topic_list;

    public static final class Builder extends Message.Builder<CardData> {
        public AiInteractiveGamePlot ai_interactive_game_plot;
        public List<SimpleForum> forum_list;
        public ThreadInfo thread_info;
        public List<RecomTopicList> topic_list;

        public Builder() {
        }

        public Builder(CardData cardData) {
            super(cardData);
            if (cardData == null) {
                return;
            }
            this.thread_info = cardData.thread_info;
            this.forum_list = Message.copyOf(cardData.forum_list);
            this.topic_list = Message.copyOf(cardData.topic_list);
            this.ai_interactive_game_plot = cardData.ai_interactive_game_plot;
        }

        @Override // com.squareup.wire.Message.Builder
        public CardData build(boolean z) {
            return new CardData(this, z);
        }
    }

    public CardData(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.thread_info = builder.thread_info;
            List<SimpleForum> list = builder.forum_list;
            if (list == null) {
                this.forum_list = DEFAULT_FORUM_LIST;
            } else {
                this.forum_list = Message.immutableCopyOf(list);
            }
            List<RecomTopicList> list2 = builder.topic_list;
            if (list2 == null) {
                this.topic_list = DEFAULT_TOPIC_LIST;
            } else {
                this.topic_list = Message.immutableCopyOf(list2);
            }
            this.ai_interactive_game_plot = builder.ai_interactive_game_plot;
            return;
        }
        this.thread_info = builder.thread_info;
        this.forum_list = Message.immutableCopyOf(builder.forum_list);
        this.topic_list = Message.immutableCopyOf(builder.topic_list);
        this.ai_interactive_game_plot = builder.ai_interactive_game_plot;
    }
}