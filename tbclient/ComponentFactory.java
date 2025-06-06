package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class ComponentFactory extends Message {
    public static final String DEFAULT_BASE_TEXT = "";
    public static final String DEFAULT_COMPONENT = "";
    public static final List<ThreadRecommendInfo> DEFAULT_FEED_RECOMTAG = Collections.emptyList();

    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public final String base_text;

    @ProtoField(tag = 40)
    public final FeedConfigurableHeadComponent card_head;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String component;

    @ProtoField(tag = 4)
    public final AbstractComponent feed_abstract;

    @ProtoField(tag = 43)
    public final FeedAiRecreationCard feed_ai_recreation_card;

    @ProtoField(tag = 26)
    public final FeedAichatCard feed_aichat_card;

    @ProtoField(tag = 36)
    public final FeedAnswerBoxComponent feed_answer_box;

    @ProtoField(tag = 25)
    public final FeedAuthorSocial feed_author_social;

    @ProtoField(tag = 51)
    public final FeedAvatarInputComponent feed_avatar_input;

    @ProtoField(tag = 41)
    public final FeedBannerComponent feed_banner;

    @ProtoField(tag = 48)
    public final FeedButtonComponent feed_button;

    @ProtoField(tag = 28)
    public final FeedConfigurableHeadComponent feed_configurable_head;

    @ProtoField(tag = 39)
    public final FeedDanmaku feed_danmaku;

    @ProtoField(tag = 10)
    public final FeedEntrybarComponent feed_entrybar;

    @ProtoField(tag = 44)
    public final ScoreFeedbackComponent feed_feedback_icon_list;

    @ProtoField(tag = 45)
    public final FeedFlipPage feed_flip_page;

    @ProtoField(tag = 42)
    public final FeedGuideCardComponent feed_guide_card;

    @ProtoField(tag = 5)
    public final FeedHeadComponent feed_head;

    @ProtoField(tag = 6)
    public final FeedHeadFigureComponent feed_head_figure;

    @ProtoField(tag = 30)
    public final FeedHeadLoopComponent feed_head_loop;

    @ProtoField(tag = 49)
    public final FeedInputGuideComponent feed_input_guide;

    @ProtoField(tag = 54)
    public final FeedInteractionComponent feed_interaction;

    @ProtoField(tag = 15)
    public final FeedItem feed_item;

    @ProtoField(tag = 17)
    public final FeedLinkComponent feed_link;

    @ProtoField(tag = 12)
    public final FeedLiveComponent feed_live;

    @ProtoField(tag = 50)
    public final FeedLoopReplyComponent feed_loop_reply;

    @ProtoField(tag = 38)
    public final FeedMixComponent feed_mix;

    @ProtoField(tag = 29)
    public final FeedHeadComponent feed_mount;

    @ProtoField(tag = 16)
    public final FeedOriginComponent feed_origin;

    @ProtoField(tag = 7)
    public final FeedPicComponent feed_pic;

    @ProtoField(tag = 35)
    public final FeedPicContentComponent feed_pic_content;

    @ProtoField(tag = 52)
    public final FeedPicSingleComponent feed_pic_single;

    @ProtoField(tag = 31)
    public final FeedPkComponent feed_pk;

    @ProtoField(tag = 22)
    public final PollInfo feed_poll;

    @ProtoField(tag = 20)
    public final FeedPostExpose feed_postexpose;

    @ProtoField(tag = 27)
    public final FeedPrivateInfoComponent feed_privateinfo;

    @ProtoField(tag = 46)
    public final FeedQuestionInfo feed_question_info;

    @ProtoField(label = Message.Label.REPEATED, tag = 18)
    public final List<ThreadRecommendInfo> feed_recomtag;

    @ProtoField(tag = 53)
    public final FeedRecomtagStaggeredComponent feed_recomtag_staggered;

    @ProtoField(tag = 21)
    public final FeedRoomComponent feed_room;

    @ProtoField(tag = 33)
    public final FeedScoreComponent feed_score;

    @ProtoField(tag = 8)
    public final FeedSocialComponent feed_social;

    @ProtoField(tag = 55)
    public final FeedTipsComponent feed_tips;

    @ProtoField(tag = 3)
    public final TitleComponent feed_title;

    @ProtoField(tag = 23)
    public final FeedToutiao feed_toutiao;

    @ProtoField(tag = 9)
    public final FeedVideoComponent feed_video;

    @ProtoField(tag = 19)
    public final FeedVideoAdComponent feed_videoad;

    @ProtoField(tag = 11)
    public final Voice feed_voice;

    @ProtoField(tag = 24)
    public final FrsTopThreadComponent frs_top_thread;

    @ProtoField(tag = 47)
    public final FeedSidewayComponent inspiration_sideway;

    @ProtoField(tag = 32)
    public final MultiThreadComponent multi_thread_card;

    @ProtoField(tag = 34)
    public final SidewayListComponent sideway_list;

    @ProtoField(tag = 14)
    public final SidewayRecomComponent sideway_recom;

    @ProtoField(tag = 37)
    public final ThreadExtShowComponent thread_ext_show;

    public static final class Builder extends Message.Builder<ComponentFactory> {
        public String base_text;
        public FeedConfigurableHeadComponent card_head;
        public String component;
        public AbstractComponent feed_abstract;
        public FeedAiRecreationCard feed_ai_recreation_card;
        public FeedAichatCard feed_aichat_card;
        public FeedAnswerBoxComponent feed_answer_box;
        public FeedAuthorSocial feed_author_social;
        public FeedAvatarInputComponent feed_avatar_input;
        public FeedBannerComponent feed_banner;
        public FeedButtonComponent feed_button;
        public FeedConfigurableHeadComponent feed_configurable_head;
        public FeedDanmaku feed_danmaku;
        public FeedEntrybarComponent feed_entrybar;
        public ScoreFeedbackComponent feed_feedback_icon_list;
        public FeedFlipPage feed_flip_page;
        public FeedGuideCardComponent feed_guide_card;
        public FeedHeadComponent feed_head;
        public FeedHeadFigureComponent feed_head_figure;
        public FeedHeadLoopComponent feed_head_loop;
        public FeedInputGuideComponent feed_input_guide;
        public FeedInteractionComponent feed_interaction;
        public FeedItem feed_item;
        public FeedLinkComponent feed_link;
        public FeedLiveComponent feed_live;
        public FeedLoopReplyComponent feed_loop_reply;
        public FeedMixComponent feed_mix;
        public FeedHeadComponent feed_mount;
        public FeedOriginComponent feed_origin;
        public FeedPicComponent feed_pic;
        public FeedPicContentComponent feed_pic_content;
        public FeedPicSingleComponent feed_pic_single;
        public FeedPkComponent feed_pk;
        public PollInfo feed_poll;
        public FeedPostExpose feed_postexpose;
        public FeedPrivateInfoComponent feed_privateinfo;
        public FeedQuestionInfo feed_question_info;
        public List<ThreadRecommendInfo> feed_recomtag;
        public FeedRecomtagStaggeredComponent feed_recomtag_staggered;
        public FeedRoomComponent feed_room;
        public FeedScoreComponent feed_score;
        public FeedSocialComponent feed_social;
        public FeedTipsComponent feed_tips;
        public TitleComponent feed_title;
        public FeedToutiao feed_toutiao;
        public FeedVideoComponent feed_video;
        public FeedVideoAdComponent feed_videoad;
        public Voice feed_voice;
        public FrsTopThreadComponent frs_top_thread;
        public FeedSidewayComponent inspiration_sideway;
        public MultiThreadComponent multi_thread_card;
        public SidewayListComponent sideway_list;
        public SidewayRecomComponent sideway_recom;
        public ThreadExtShowComponent thread_ext_show;

        public Builder() {
        }

        public Builder(ComponentFactory componentFactory) {
            super(componentFactory);
            if (componentFactory == null) {
                return;
            }
            this.component = componentFactory.component;
            this.feed_title = componentFactory.feed_title;
            this.feed_abstract = componentFactory.feed_abstract;
            this.feed_head = componentFactory.feed_head;
            this.feed_head_figure = componentFactory.feed_head_figure;
            this.feed_pic = componentFactory.feed_pic;
            this.feed_social = componentFactory.feed_social;
            this.feed_video = componentFactory.feed_video;
            this.feed_entrybar = componentFactory.feed_entrybar;
            this.feed_voice = componentFactory.feed_voice;
            this.feed_live = componentFactory.feed_live;
            this.base_text = componentFactory.base_text;
            this.sideway_recom = componentFactory.sideway_recom;
            this.feed_item = componentFactory.feed_item;
            this.feed_origin = componentFactory.feed_origin;
            this.feed_link = componentFactory.feed_link;
            this.feed_recomtag = Message.copyOf(componentFactory.feed_recomtag);
            this.feed_videoad = componentFactory.feed_videoad;
            this.feed_postexpose = componentFactory.feed_postexpose;
            this.feed_room = componentFactory.feed_room;
            this.feed_poll = componentFactory.feed_poll;
            this.feed_toutiao = componentFactory.feed_toutiao;
            this.frs_top_thread = componentFactory.frs_top_thread;
            this.feed_author_social = componentFactory.feed_author_social;
            this.feed_aichat_card = componentFactory.feed_aichat_card;
            this.feed_privateinfo = componentFactory.feed_privateinfo;
            this.feed_configurable_head = componentFactory.feed_configurable_head;
            this.feed_mount = componentFactory.feed_mount;
            this.feed_head_loop = componentFactory.feed_head_loop;
            this.feed_pk = componentFactory.feed_pk;
            this.multi_thread_card = componentFactory.multi_thread_card;
            this.feed_score = componentFactory.feed_score;
            this.sideway_list = componentFactory.sideway_list;
            this.feed_pic_content = componentFactory.feed_pic_content;
            this.feed_answer_box = componentFactory.feed_answer_box;
            this.thread_ext_show = componentFactory.thread_ext_show;
            this.feed_mix = componentFactory.feed_mix;
            this.feed_danmaku = componentFactory.feed_danmaku;
            this.card_head = componentFactory.card_head;
            this.feed_banner = componentFactory.feed_banner;
            this.feed_guide_card = componentFactory.feed_guide_card;
            this.feed_ai_recreation_card = componentFactory.feed_ai_recreation_card;
            this.feed_feedback_icon_list = componentFactory.feed_feedback_icon_list;
            this.feed_flip_page = componentFactory.feed_flip_page;
            this.feed_question_info = componentFactory.feed_question_info;
            this.inspiration_sideway = componentFactory.inspiration_sideway;
            this.feed_button = componentFactory.feed_button;
            this.feed_input_guide = componentFactory.feed_input_guide;
            this.feed_loop_reply = componentFactory.feed_loop_reply;
            this.feed_avatar_input = componentFactory.feed_avatar_input;
            this.feed_pic_single = componentFactory.feed_pic_single;
            this.feed_recomtag_staggered = componentFactory.feed_recomtag_staggered;
            this.feed_interaction = componentFactory.feed_interaction;
            this.feed_tips = componentFactory.feed_tips;
        }

        @Override // com.squareup.wire.Message.Builder
        public ComponentFactory build(boolean z) {
            return new ComponentFactory(this, z);
        }
    }

    public ComponentFactory(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.component;
            if (str == null) {
                this.component = "";
            } else {
                this.component = str;
            }
            this.feed_title = builder.feed_title;
            this.feed_abstract = builder.feed_abstract;
            this.feed_head = builder.feed_head;
            this.feed_head_figure = builder.feed_head_figure;
            this.feed_pic = builder.feed_pic;
            this.feed_social = builder.feed_social;
            this.feed_video = builder.feed_video;
            this.feed_entrybar = builder.feed_entrybar;
            this.feed_voice = builder.feed_voice;
            this.feed_live = builder.feed_live;
            String str2 = builder.base_text;
            if (str2 == null) {
                this.base_text = "";
            } else {
                this.base_text = str2;
            }
            this.sideway_recom = builder.sideway_recom;
            this.feed_item = builder.feed_item;
            this.feed_origin = builder.feed_origin;
            this.feed_link = builder.feed_link;
            List<ThreadRecommendInfo> list = builder.feed_recomtag;
            if (list == null) {
                this.feed_recomtag = DEFAULT_FEED_RECOMTAG;
            } else {
                this.feed_recomtag = Message.immutableCopyOf(list);
            }
            this.feed_videoad = builder.feed_videoad;
            this.feed_postexpose = builder.feed_postexpose;
            this.feed_room = builder.feed_room;
            this.feed_poll = builder.feed_poll;
            this.feed_toutiao = builder.feed_toutiao;
            this.frs_top_thread = builder.frs_top_thread;
            this.feed_author_social = builder.feed_author_social;
            this.feed_aichat_card = builder.feed_aichat_card;
            this.feed_privateinfo = builder.feed_privateinfo;
            this.feed_configurable_head = builder.feed_configurable_head;
            this.feed_mount = builder.feed_mount;
            this.feed_head_loop = builder.feed_head_loop;
            this.feed_pk = builder.feed_pk;
            this.multi_thread_card = builder.multi_thread_card;
            this.feed_score = builder.feed_score;
            this.sideway_list = builder.sideway_list;
            this.feed_pic_content = builder.feed_pic_content;
            this.feed_answer_box = builder.feed_answer_box;
            this.thread_ext_show = builder.thread_ext_show;
            this.feed_mix = builder.feed_mix;
            this.feed_danmaku = builder.feed_danmaku;
            this.card_head = builder.card_head;
            this.feed_banner = builder.feed_banner;
            this.feed_guide_card = builder.feed_guide_card;
            this.feed_ai_recreation_card = builder.feed_ai_recreation_card;
            this.feed_feedback_icon_list = builder.feed_feedback_icon_list;
            this.feed_flip_page = builder.feed_flip_page;
            this.feed_question_info = builder.feed_question_info;
            this.inspiration_sideway = builder.inspiration_sideway;
            this.feed_button = builder.feed_button;
            this.feed_input_guide = builder.feed_input_guide;
            this.feed_loop_reply = builder.feed_loop_reply;
            this.feed_avatar_input = builder.feed_avatar_input;
            this.feed_pic_single = builder.feed_pic_single;
            this.feed_recomtag_staggered = builder.feed_recomtag_staggered;
            this.feed_interaction = builder.feed_interaction;
            this.feed_tips = builder.feed_tips;
            return;
        }
        this.component = builder.component;
        this.feed_title = builder.feed_title;
        this.feed_abstract = builder.feed_abstract;
        this.feed_head = builder.feed_head;
        this.feed_head_figure = builder.feed_head_figure;
        this.feed_pic = builder.feed_pic;
        this.feed_social = builder.feed_social;
        this.feed_video = builder.feed_video;
        this.feed_entrybar = builder.feed_entrybar;
        this.feed_voice = builder.feed_voice;
        this.feed_live = builder.feed_live;
        this.base_text = builder.base_text;
        this.sideway_recom = builder.sideway_recom;
        this.feed_item = builder.feed_item;
        this.feed_origin = builder.feed_origin;
        this.feed_link = builder.feed_link;
        this.feed_recomtag = Message.immutableCopyOf(builder.feed_recomtag);
        this.feed_videoad = builder.feed_videoad;
        this.feed_postexpose = builder.feed_postexpose;
        this.feed_room = builder.feed_room;
        this.feed_poll = builder.feed_poll;
        this.feed_toutiao = builder.feed_toutiao;
        this.frs_top_thread = builder.frs_top_thread;
        this.feed_author_social = builder.feed_author_social;
        this.feed_aichat_card = builder.feed_aichat_card;
        this.feed_privateinfo = builder.feed_privateinfo;
        this.feed_configurable_head = builder.feed_configurable_head;
        this.feed_mount = builder.feed_mount;
        this.feed_head_loop = builder.feed_head_loop;
        this.feed_pk = builder.feed_pk;
        this.multi_thread_card = builder.multi_thread_card;
        this.feed_score = builder.feed_score;
        this.sideway_list = builder.sideway_list;
        this.feed_pic_content = builder.feed_pic_content;
        this.feed_answer_box = builder.feed_answer_box;
        this.thread_ext_show = builder.thread_ext_show;
        this.feed_mix = builder.feed_mix;
        this.feed_danmaku = builder.feed_danmaku;
        this.card_head = builder.card_head;
        this.feed_banner = builder.feed_banner;
        this.feed_guide_card = builder.feed_guide_card;
        this.feed_ai_recreation_card = builder.feed_ai_recreation_card;
        this.feed_feedback_icon_list = builder.feed_feedback_icon_list;
        this.feed_flip_page = builder.feed_flip_page;
        this.feed_question_info = builder.feed_question_info;
        this.inspiration_sideway = builder.inspiration_sideway;
        this.feed_button = builder.feed_button;
        this.feed_input_guide = builder.feed_input_guide;
        this.feed_loop_reply = builder.feed_loop_reply;
        this.feed_avatar_input = builder.feed_avatar_input;
        this.feed_pic_single = builder.feed_pic_single;
        this.feed_recomtag_staggered = builder.feed_recomtag_staggered;
        this.feed_interaction = builder.feed_interaction;
        this.feed_tips = builder.feed_tips;
    }
}