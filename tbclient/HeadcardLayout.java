package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class HeadcardLayout extends Message {
    public static final String DEFAULT_CARD_TITLE = "";

    @ProtoField(tag = 3)
    public final ThemeColorInfo card_background;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String card_title;

    @ProtoField(tag = 4)
    public final PubHeadCardCover cover;

    @ProtoField(label = Message.Label.REPEATED, tag = 6)
    public final List<FeedKV> log_param;

    @ProtoField(label = Message.Label.REPEATED, tag = 7, type = Message.Datatype.STRING)
    public final List<String> prefetch_schema;

    @ProtoField(tag = 5)
    public final QuizCard quiz_card;

    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ThreadInfo> thread_list;
    public static final List<ThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
    public static final List<FeedKV> DEFAULT_LOG_PARAM = Collections.emptyList();
    public static final List<String> DEFAULT_PREFETCH_SCHEMA = Collections.emptyList();

    public static final class Builder extends Message.Builder<HeadcardLayout> {
        public ThemeColorInfo card_background;
        public String card_title;
        public PubHeadCardCover cover;
        public List<FeedKV> log_param;
        public List<String> prefetch_schema;
        public QuizCard quiz_card;
        public List<ThreadInfo> thread_list;

        public Builder() {
        }

        public Builder(HeadcardLayout headcardLayout) {
            super(headcardLayout);
            if (headcardLayout == null) {
                return;
            }
            this.card_title = headcardLayout.card_title;
            this.thread_list = Message.copyOf(headcardLayout.thread_list);
            this.card_background = headcardLayout.card_background;
            this.cover = headcardLayout.cover;
            this.quiz_card = headcardLayout.quiz_card;
            this.log_param = Message.copyOf(headcardLayout.log_param);
            this.prefetch_schema = Message.copyOf(headcardLayout.prefetch_schema);
        }

        @Override // com.squareup.wire.Message.Builder
        public HeadcardLayout build(boolean z) {
            return new HeadcardLayout(this, z);
        }
    }

    public HeadcardLayout(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.card_title;
            if (str == null) {
                this.card_title = "";
            } else {
                this.card_title = str;
            }
            List<ThreadInfo> list = builder.thread_list;
            if (list == null) {
                this.thread_list = DEFAULT_THREAD_LIST;
            } else {
                this.thread_list = Message.immutableCopyOf(list);
            }
            this.card_background = builder.card_background;
            this.cover = builder.cover;
            this.quiz_card = builder.quiz_card;
            List<FeedKV> list2 = builder.log_param;
            if (list2 == null) {
                this.log_param = DEFAULT_LOG_PARAM;
            } else {
                this.log_param = Message.immutableCopyOf(list2);
            }
            List<String> list3 = builder.prefetch_schema;
            if (list3 == null) {
                this.prefetch_schema = DEFAULT_PREFETCH_SCHEMA;
                return;
            } else {
                this.prefetch_schema = Message.immutableCopyOf(list3);
                return;
            }
        }
        this.card_title = builder.card_title;
        this.thread_list = Message.immutableCopyOf(builder.thread_list);
        this.card_background = builder.card_background;
        this.cover = builder.cover;
        this.quiz_card = builder.quiz_card;
        this.log_param = Message.immutableCopyOf(builder.log_param);
        this.prefetch_schema = Message.immutableCopyOf(builder.prefetch_schema);
    }
}