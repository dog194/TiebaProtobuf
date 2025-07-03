package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class LayoutFactory extends Message {
    public static final List<FeedKV> DEFAULT_FREQ_INFO = Collections.emptyList();
    public static final String DEFAULT_LAYOUT = "";

    @ProtoField(tag = 19)
    public final BannerCardLayout banner_card;

    @ProtoField(tag = 21)
    public final FeedbackCardLayout bawu_feedback_card;

    @ProtoField(tag = 10)
    public final CardFrequency card_click_frequency;

    @ProtoField(tag = 9)
    public final CardFrequency card_expose_frequency;

    @ProtoField(tag = 24)
    public final DiscussLayout discuss_card;

    @ProtoField(tag = 6)
    public final VideoDoubleRowLayout double_row_video;

    @ProtoField(tag = 2)
    public final FeedLayout feed;

    @ProtoField(tag = 23)
    public final FeedStaggerLayout feed_stagger_layout;

    @ProtoField(label = Message.Label.REPEATED, tag = 16)
    public final List<FeedKV> freq_info;

    @ProtoField(tag = 5)
    public final FrsTopThreadCardLayout frs_top_thread_card;

    @ProtoField(tag = 20)
    public final GuideCardLayout guide_card;

    @ProtoField(tag = 4)
    public final HeadcardLayout headcard;

    @ProtoField(tag = 11)
    public final HotCardLayout hot_card;

    @ProtoField(tag = 17)
    public final HotTopicCardLayout hot_topic_card;

    @ProtoField(tag = 18)
    public final InspirationTopicCardLayout inspiration_topic_card;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String layout;

    @ProtoField(tag = 12)
    public final MultiThreadCardLayout multi_thread_card;

    @ProtoField(tag = 22)
    public final QuestionCard question_card;

    @ProtoField(tag = 3)
    public final SidewayLayout sideway;

    @ProtoField(tag = 15)
    public final SidewayLayout sideway_vertical;

    @ProtoField(tag = 7)
    public final PlaceholderLayout template_stub_hot_card;

    @ProtoField(tag = 13)
    public final PlaceholderLayout template_stub_hot_forum_group;

    @ProtoField(tag = 14)
    public final PlaceholderLayout template_stub_interest_card;

    @ProtoField(tag = 8)
    public final PlaceholderLayout template_stub_recommend_forums;

    public static final class Builder extends Message.Builder<LayoutFactory> {
        public BannerCardLayout banner_card;
        public FeedbackCardLayout bawu_feedback_card;
        public CardFrequency card_click_frequency;
        public CardFrequency card_expose_frequency;
        public DiscussLayout discuss_card;
        public VideoDoubleRowLayout double_row_video;
        public FeedLayout feed;
        public FeedStaggerLayout feed_stagger_layout;
        public List<FeedKV> freq_info;
        public FrsTopThreadCardLayout frs_top_thread_card;
        public GuideCardLayout guide_card;
        public HeadcardLayout headcard;
        public HotCardLayout hot_card;
        public HotTopicCardLayout hot_topic_card;
        public InspirationTopicCardLayout inspiration_topic_card;
        public String layout;
        public MultiThreadCardLayout multi_thread_card;
        public QuestionCard question_card;
        public SidewayLayout sideway;
        public SidewayLayout sideway_vertical;
        public PlaceholderLayout template_stub_hot_card;
        public PlaceholderLayout template_stub_hot_forum_group;
        public PlaceholderLayout template_stub_interest_card;
        public PlaceholderLayout template_stub_recommend_forums;

        public Builder() {
        }

        public Builder(LayoutFactory layoutFactory) {
            super(layoutFactory);
            if (layoutFactory == null) {
                return;
            }
            this.layout = layoutFactory.layout;
            this.feed = layoutFactory.feed;
            this.sideway = layoutFactory.sideway;
            this.headcard = layoutFactory.headcard;
            this.frs_top_thread_card = layoutFactory.frs_top_thread_card;
            this.double_row_video = layoutFactory.double_row_video;
            this.template_stub_hot_card = layoutFactory.template_stub_hot_card;
            this.template_stub_recommend_forums = layoutFactory.template_stub_recommend_forums;
            this.card_expose_frequency = layoutFactory.card_expose_frequency;
            this.card_click_frequency = layoutFactory.card_click_frequency;
            this.hot_card = layoutFactory.hot_card;
            this.multi_thread_card = layoutFactory.multi_thread_card;
            this.template_stub_hot_forum_group = layoutFactory.template_stub_hot_forum_group;
            this.template_stub_interest_card = layoutFactory.template_stub_interest_card;
            this.sideway_vertical = layoutFactory.sideway_vertical;
            this.freq_info = Message.copyOf(layoutFactory.freq_info);
            this.hot_topic_card = layoutFactory.hot_topic_card;
            this.inspiration_topic_card = layoutFactory.inspiration_topic_card;
            this.banner_card = layoutFactory.banner_card;
            this.guide_card = layoutFactory.guide_card;
            this.bawu_feedback_card = layoutFactory.bawu_feedback_card;
            this.question_card = layoutFactory.question_card;
            this.feed_stagger_layout = layoutFactory.feed_stagger_layout;
            this.discuss_card = layoutFactory.discuss_card;
        }

        @Override // com.squareup.wire.Message.Builder
        public LayoutFactory build(boolean z) {
            return new LayoutFactory(this, z);
        }
    }

    public LayoutFactory(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.layout;
            if (str == null) {
                this.layout = "";
            } else {
                this.layout = str;
            }
            this.feed = builder.feed;
            this.sideway = builder.sideway;
            this.headcard = builder.headcard;
            this.frs_top_thread_card = builder.frs_top_thread_card;
            this.double_row_video = builder.double_row_video;
            this.template_stub_hot_card = builder.template_stub_hot_card;
            this.template_stub_recommend_forums = builder.template_stub_recommend_forums;
            this.card_expose_frequency = builder.card_expose_frequency;
            this.card_click_frequency = builder.card_click_frequency;
            this.hot_card = builder.hot_card;
            this.multi_thread_card = builder.multi_thread_card;
            this.template_stub_hot_forum_group = builder.template_stub_hot_forum_group;
            this.template_stub_interest_card = builder.template_stub_interest_card;
            this.sideway_vertical = builder.sideway_vertical;
            List<FeedKV> list = builder.freq_info;
            if (list == null) {
                this.freq_info = DEFAULT_FREQ_INFO;
            } else {
                this.freq_info = Message.immutableCopyOf(list);
            }
            this.hot_topic_card = builder.hot_topic_card;
            this.inspiration_topic_card = builder.inspiration_topic_card;
            this.banner_card = builder.banner_card;
            this.guide_card = builder.guide_card;
            this.bawu_feedback_card = builder.bawu_feedback_card;
            this.question_card = builder.question_card;
            this.feed_stagger_layout = builder.feed_stagger_layout;
            this.discuss_card = builder.discuss_card;
            return;
        }
        this.layout = builder.layout;
        this.feed = builder.feed;
        this.sideway = builder.sideway;
        this.headcard = builder.headcard;
        this.frs_top_thread_card = builder.frs_top_thread_card;
        this.double_row_video = builder.double_row_video;
        this.template_stub_hot_card = builder.template_stub_hot_card;
        this.template_stub_recommend_forums = builder.template_stub_recommend_forums;
        this.card_expose_frequency = builder.card_expose_frequency;
        this.card_click_frequency = builder.card_click_frequency;
        this.hot_card = builder.hot_card;
        this.multi_thread_card = builder.multi_thread_card;
        this.template_stub_hot_forum_group = builder.template_stub_hot_forum_group;
        this.template_stub_interest_card = builder.template_stub_interest_card;
        this.sideway_vertical = builder.sideway_vertical;
        this.freq_info = Message.immutableCopyOf(builder.freq_info);
        this.hot_topic_card = builder.hot_topic_card;
        this.inspiration_topic_card = builder.inspiration_topic_card;
        this.banner_card = builder.banner_card;
        this.guide_card = builder.guide_card;
        this.bawu_feedback_card = builder.bawu_feedback_card;
        this.question_card = builder.question_card;
        this.feed_stagger_layout = builder.feed_stagger_layout;
        this.discuss_card = builder.discuss_card;
    }
}