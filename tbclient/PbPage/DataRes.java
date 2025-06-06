package tbclient.PbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.AichatBotCard;
import tbclient.AlaLiveInfo;
import tbclient.Anti;
import tbclient.BannerList;
import tbclient.BusinessAccountInfo;
import tbclient.EditConfig;
import tbclient.EditInfo;
import tbclient.FeedKV;
import tbclient.FineBannerPb;
import tbclient.ForumRuleStatus;
import tbclient.ForumShopGoodsInfo;
import tbclient.GameDetail;
import tbclient.GraffitiRankListInfo;
import tbclient.GuideWordList;
import tbclient.InputHintItem;
import tbclient.JumpLinkInfo;
import tbclient.Lbs;
import tbclient.ManagerElection;
import tbclient.MutliAichatBotCard;
import tbclient.NaGuide;
import tbclient.Page;
import tbclient.PbHotPost;
import tbclient.PbTopAgreePost;
import tbclient.PlaceholderText;
import tbclient.Post;
import tbclient.Promotion;
import tbclient.PsRankListItem;
import tbclient.PushFeedbackInfo;
import tbclient.RecomTopicList;
import tbclient.RecommendThread;
import tbclient.RobotEntrance;
import tbclient.SdkTopicThread;
import tbclient.ShareChatroom;
import tbclient.SimpleForum;
import tbclient.SimpleUser;
import tbclient.SpriteShowStrategy;
import tbclient.SuggestQuery;
import tbclient.TabInfo;
import tbclient.ThreadAlbumManage;
import tbclient.ThreadInfo;
import tbclient.TwZhiBoAnti;
import tbclient.User;
import tbclient.WebviewData;

/* loaded from: classes4.dex */
public final class DataRes extends Message {
    public static final String DEFAULT_ASP_SHOWN_INFO = "";
    public static final String DEFAULT_FOLD_TIP = "";
    public static final String DEFAULT_JUMPTOTAB2 = "";
    public static final String DEFAULT_MULTI_FORUM_TEXT = "";
    public static final String DEFAULT_PARTIAL_VISIBLE_TOAST = "";
    public static final String DEFAULT_PB_NOTICE = "";
    public static final String DEFAULT_RETURN_PAGE = "";
    public static final String DEFAULT_SEARCH_QUERY = "";

    @ProtoField(tag = 88, type = Message.Datatype.INT32)
    public final Integer ad_show_select;

    @ProtoField(tag = 5)
    public final AddPost add_post;

    @ProtoField(tag = 79)
    public final AichatBotCard aichat_bot_card;

    @ProtoField(label = Message.Label.REPEATED, tag = 77)
    public final List<AiChatCard> aichat_card;

    @ProtoField(tag = 26)
    public final AlaLiveInfo ala_info;

    @ProtoField(tag = 4)
    public final Anti anti;

    @ProtoField(tag = 22)
    public final AppealInfo appeal_info;

    @ProtoField(tag = 28, type = Message.Datatype.STRING)
    public final String asp_shown_info;

    @ProtoField(tag = 12)
    public final BannerList banner_list;

    @ProtoField(tag = 103)
    public final BawuDeleteReasonItem bawu_delete_reason;

    @ProtoField(label = Message.Label.REPEATED, tag = 52)
    public final List<ThreadInfo> bjh_recommend;

    @ProtoField(tag = 85)
    public final GameDetail bottom_toast;

    @ProtoField(tag = 86)
    public final BreadcrumbNavigation breadcrumb_navigation;

    @ProtoField(tag = 58)
    public final BusinessAccountInfo business_account_info;

    @ProtoField(tag = 53)
    public final BusinessPromotInfo business_promot_info;

    @ProtoField(tag = 91)
    public final TabInfo current_tab;

    @ProtoField(tag = 39)
    public final SimpleForum display_forum;

    @ProtoField(tag = 71)
    public final EditConfig edit_config;

    @ProtoField(tag = 72)
    public final EditInfo edit_info;

    @ProtoField(tag = 46, type = Message.Datatype.INT32)
    public final Integer exp_guide_today;

    @ProtoField(tag = 45, type = Message.Datatype.INT32)
    public final Integer exp_news_today;

    @ProtoField(tag = 33)
    public final FeedExtInfo feed_info;

    @ProtoField(label = Message.Label.REPEATED, tag = 30)
    public final List<ThreadInfo> feed_thread_list;

    @ProtoField(label = Message.Label.REPEATED, tag = 17)
    public final List<FineBannerPb> fine_banner;

    @ProtoField(tag = 97)
    public final Post first_floor;

    @ProtoField(tag = 38)
    public final Post first_floor_post;

    @ProtoField(tag = 64)
    public final FloatingIcon floating_icon;

    @ProtoField(tag = 70, type = Message.Datatype.INT64)
    public final Long fold_comment_num;

    @ProtoField(tag = 44, type = Message.Datatype.STRING)
    public final String fold_tip;

    @ProtoField(tag = 43)
    public final PbFollowTip follow_tip;

    @ProtoField(tag = 2)
    public final SimpleForum forum;

    @ProtoField(tag = 27)
    public final ForumHeadlineImgInfo forum_headline_img_info;

    @ProtoField(tag = 60)
    public final ForumRuleStatus forum_rule;

    @ProtoField(label = Message.Label.REPEATED, tag = 36)
    public final List<SimpleForum> from_forum_list;

    @ProtoField(tag = 94)
    public final GameDetail game_detail;

    @ProtoField(tag = 23)
    public final GodCard god_card;

    @ProtoField(tag = 21)
    public final GraffitiRankListInfo graffiti_rank_list_info;

    @ProtoField(tag = 29)
    public final GuessLikeStruct guess_like;

    @ProtoField(label = Message.Label.REPEATED, tag = 83)
    public final List<GuideWordList> guide_word_list;

    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer has_floor;

    @ProtoField(tag = 68, type = Message.Datatype.INT32)
    public final Integer has_fold_comment;

    @ProtoField(tag = 20)
    public final PbHotPost hot_post_list;

    @ProtoField(label = Message.Label.REPEATED, tag = 102)
    public final List<InputHintItem> input_hint;

    @ProtoField(tag = 62, type = Message.Datatype.INT32)
    public final Integer is_black_white;

    @ProtoField(tag = 31, type = Message.Datatype.UINT32)
    public final Integer is_follow_current_channel;

    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer is_new_url;

    @ProtoField(tag = 63, type = Message.Datatype.INT32)
    public final Integer is_official_forum;

    @ProtoField(tag = 65, type = Message.Datatype.INT32)
    public final Integer is_purchase;

    @ProtoField(tag = 101, type = Message.Datatype.UINT32)
    public final Integer is_tid_white;

    @ProtoField(tag = 74)
    public final JumpLinkInfo jump_link_info;

    @ProtoField(tag = 56, type = Message.Datatype.INT32)
    public final Integer jumptotab1;

    @ProtoField(tag = 57, type = Message.Datatype.STRING)
    public final String jumptotab2;

    @ProtoField(label = Message.Label.REPEATED, tag = 84, type = Message.Datatype.STRING)
    public final List<String> limit_dialog_name;

    @ProtoField(tag = 9)
    public final Lbs location;

    @ProtoField(label = Message.Label.REPEATED, tag = 81)
    public final List<FeedKV> log_param;

    @ProtoField(tag = 51)
    public final ManagerElection manager_election;

    @ProtoField(tag = 47, type = Message.Datatype.STRING)
    public final String multi_forum_text;

    @ProtoField(tag = 104)
    public final MutliAichatBotCard mutli_aichat_bot_card;

    @ProtoField(tag = 42)
    public final NaGuide na_guide;

    @ProtoField(label = Message.Label.REPEATED, tag = 40)
    public final List<SimpleUser> new_agree_user;

    @ProtoField(tag = 15)
    public final NewsInfo news_info;

    @ProtoField(tag = 3)
    public final Page page;

    @ProtoField(tag = 41, type = Message.Datatype.STRING)
    public final String partial_visible_toast;

    @ProtoField(tag = 87)
    public final PbGamePop pb_game_pop;

    @ProtoField(tag = 67, type = Message.Datatype.STRING)
    public final String pb_notice;

    @ProtoField(tag = 66, type = Message.Datatype.INT32)
    public final Integer pb_notice_type;

    @ProtoField(label = Message.Label.REPEATED, tag = 49)
    public final List<PbSortType> pb_sort_info;

    @ProtoField(tag = 98)
    public final PlaceholderText placeholder_text;

    @ProtoField(label = Message.Label.REPEATED, tag = 24)
    public final List<PsRankListItem> play_rank_list;

    @ProtoField(label = Message.Label.REPEATED, tag = 11)
    public final List<PostBanner> post_banner;

    @ProtoField(label = Message.Label.REPEATED, tag = 6)
    public final List<Post> post_list;

    @ProtoField(tag = 54)
    public final Promotion promotion;

    @ProtoField(tag = 80)
    public final PushFeedbackInfo push_feedback_info;

    @ProtoField(tag = 55)
    public final AlaLiveInfo recom_ala_info;

    @ProtoField(label = Message.Label.REPEATED, tag = 59)
    public final List<ThreadInfo> recom_thread_info;

    @ProtoField(tag = 25)
    public final RecommendBook recommend_book;

    @ProtoField(label = Message.Label.REPEATED, tag = 16)
    public final List<RecommendThread> recommend_threads;

    @ProtoField(label = Message.Label.REPEATED, tag = 35)
    public final List<SimpleForum> repost_recommend_forum_list;

    @ProtoField(tag = 96, type = Message.Datatype.STRING)
    public final String return_page;

    @ProtoField(tag = 76)
    public final RobotEntrance robot_entrance;

    @ProtoField(tag = 100, type = Message.Datatype.UINT32)
    public final Integer scroll;

    @ProtoField(tag = 19)
    public final SdkTopicThread sdk_topic_thread;

    @ProtoField(tag = 92, type = Message.Datatype.STRING)
    public final String search_query;

    @ProtoField(tag = 14, type = Message.Datatype.INT32)
    public final Integer server_time;

    @ProtoField(tag = 105)
    public final SettingInfo setting_info;

    @ProtoField(tag = 78)
    public final ShareChatroom share_chatroom;

    @ProtoField(tag = 106)
    public final ForumShopGoodsInfo shop_goods_info;

    @ProtoField(tag = 61, type = Message.Datatype.INT32)
    public final Integer show_adsense;

    @ProtoField(tag = 75)
    public final SimilarContent similar_content;

    @ProtoField(tag = 50, type = Message.Datatype.INT32)
    public final Integer sort_type;

    @ProtoField(tag = 95)
    public final SpriteShowStrategy sprite_show_strategy;

    @ProtoField(tag = 93)
    public final SuggestQuery suggest_querys;

    @ProtoField(tag = 32, type = Message.Datatype.INT32)
    public final Integer switch_read_open;

    @ProtoField(label = Message.Label.REPEATED, tag = 90)
    public final List<TabInfo> tab_info;

    @ProtoField(tag = 8)
    public final ThreadInfo thread;

    @ProtoField(tag = 99)
    public final ThreadAlbumManage thread_album_manage;

    @ProtoField(tag = 37, type = Message.Datatype.INT64)
    public final Long thread_freq_num;

    @ProtoField(label = Message.Label.REPEATED, tag = 48)
    public final List<RecomTopicList> thread_topic;

    @ProtoField(tag = 34)
    public final PbTopAgreePost top_agree_post_list;

    @ProtoField(tag = 73)
    public final Post top_answer;

    @ProtoField(tag = 18)
    public final TwZhiBoAnti twzhibo_anti;

    @ProtoField(tag = 1)
    public final User user;

    @ProtoField(label = Message.Label.REPEATED, tag = 13)
    public final List<User> user_list;

    @ProtoField(tag = 89)
    public final WebviewData webview_data;
    public static final List<Post> DEFAULT_POST_LIST = Collections.emptyList();
    public static final Integer DEFAULT_HAS_FLOOR = 0;
    public static final Integer DEFAULT_IS_NEW_URL = 0;
    public static final List<PostBanner> DEFAULT_POST_BANNER = Collections.emptyList();
    public static final List<User> DEFAULT_USER_LIST = Collections.emptyList();
    public static final Integer DEFAULT_SERVER_TIME = 0;
    public static final List<RecommendThread> DEFAULT_RECOMMEND_THREADS = Collections.emptyList();
    public static final List<FineBannerPb> DEFAULT_FINE_BANNER = Collections.emptyList();
    public static final List<PsRankListItem> DEFAULT_PLAY_RANK_LIST = Collections.emptyList();
    public static final List<ThreadInfo> DEFAULT_FEED_THREAD_LIST = Collections.emptyList();
    public static final Integer DEFAULT_IS_FOLLOW_CURRENT_CHANNEL = 0;
    public static final Integer DEFAULT_SWITCH_READ_OPEN = 0;
    public static final List<SimpleForum> DEFAULT_REPOST_RECOMMEND_FORUM_LIST = Collections.emptyList();
    public static final List<SimpleForum> DEFAULT_FROM_FORUM_LIST = Collections.emptyList();
    public static final Long DEFAULT_THREAD_FREQ_NUM = 0L;
    public static final List<SimpleUser> DEFAULT_NEW_AGREE_USER = Collections.emptyList();
    public static final Integer DEFAULT_EXP_NEWS_TODAY = 0;
    public static final Integer DEFAULT_EXP_GUIDE_TODAY = 0;
    public static final List<RecomTopicList> DEFAULT_THREAD_TOPIC = Collections.emptyList();
    public static final List<PbSortType> DEFAULT_PB_SORT_INFO = Collections.emptyList();
    public static final Integer DEFAULT_SORT_TYPE = 0;
    public static final List<ThreadInfo> DEFAULT_BJH_RECOMMEND = Collections.emptyList();
    public static final Integer DEFAULT_JUMPTOTAB1 = 0;
    public static final List<ThreadInfo> DEFAULT_RECOM_THREAD_INFO = Collections.emptyList();
    public static final Integer DEFAULT_SHOW_ADSENSE = 0;
    public static final Integer DEFAULT_IS_BLACK_WHITE = 0;
    public static final Integer DEFAULT_IS_OFFICIAL_FORUM = 0;
    public static final Integer DEFAULT_IS_PURCHASE = 0;
    public static final Integer DEFAULT_PB_NOTICE_TYPE = 0;
    public static final Integer DEFAULT_HAS_FOLD_COMMENT = 0;
    public static final Long DEFAULT_FOLD_COMMENT_NUM = 0L;
    public static final List<AiChatCard> DEFAULT_AICHAT_CARD = Collections.emptyList();
    public static final List<FeedKV> DEFAULT_LOG_PARAM = Collections.emptyList();
    public static final List<GuideWordList> DEFAULT_GUIDE_WORD_LIST = Collections.emptyList();
    public static final List<String> DEFAULT_LIMIT_DIALOG_NAME = Collections.emptyList();
    public static final Integer DEFAULT_AD_SHOW_SELECT = 0;
    public static final List<TabInfo> DEFAULT_TAB_INFO = Collections.emptyList();
    public static final Integer DEFAULT_SCROLL = 0;
    public static final Integer DEFAULT_IS_TID_WHITE = 0;
    public static final List<InputHintItem> DEFAULT_INPUT_HINT = Collections.emptyList();

    public static final class Builder extends Message.Builder<DataRes> {
        public Integer ad_show_select;
        public AddPost add_post;
        public AichatBotCard aichat_bot_card;
        public List<AiChatCard> aichat_card;
        public AlaLiveInfo ala_info;
        public Anti anti;
        public AppealInfo appeal_info;
        public String asp_shown_info;
        public BannerList banner_list;
        public BawuDeleteReasonItem bawu_delete_reason;
        public List<ThreadInfo> bjh_recommend;
        public GameDetail bottom_toast;
        public BreadcrumbNavigation breadcrumb_navigation;
        public BusinessAccountInfo business_account_info;
        public BusinessPromotInfo business_promot_info;
        public TabInfo current_tab;
        public SimpleForum display_forum;
        public EditConfig edit_config;
        public EditInfo edit_info;
        public Integer exp_guide_today;
        public Integer exp_news_today;
        public FeedExtInfo feed_info;
        public List<ThreadInfo> feed_thread_list;
        public List<FineBannerPb> fine_banner;
        public Post first_floor;
        public Post first_floor_post;
        public FloatingIcon floating_icon;
        public Long fold_comment_num;
        public String fold_tip;
        public PbFollowTip follow_tip;
        public SimpleForum forum;
        public ForumHeadlineImgInfo forum_headline_img_info;
        public ForumRuleStatus forum_rule;
        public List<SimpleForum> from_forum_list;
        public GameDetail game_detail;
        public GodCard god_card;
        public GraffitiRankListInfo graffiti_rank_list_info;
        public GuessLikeStruct guess_like;
        public List<GuideWordList> guide_word_list;
        public Integer has_floor;
        public Integer has_fold_comment;
        public PbHotPost hot_post_list;
        public List<InputHintItem> input_hint;
        public Integer is_black_white;
        public Integer is_follow_current_channel;
        public Integer is_new_url;
        public Integer is_official_forum;
        public Integer is_purchase;
        public Integer is_tid_white;
        public JumpLinkInfo jump_link_info;
        public Integer jumptotab1;
        public String jumptotab2;
        public List<String> limit_dialog_name;
        public Lbs location;
        public List<FeedKV> log_param;
        public ManagerElection manager_election;
        public String multi_forum_text;
        public MutliAichatBotCard mutli_aichat_bot_card;
        public NaGuide na_guide;
        public List<SimpleUser> new_agree_user;
        public NewsInfo news_info;
        public Page page;
        public String partial_visible_toast;
        public PbGamePop pb_game_pop;
        public String pb_notice;
        public Integer pb_notice_type;
        public List<PbSortType> pb_sort_info;
        public PlaceholderText placeholder_text;
        public List<PsRankListItem> play_rank_list;
        public List<PostBanner> post_banner;
        public List<Post> post_list;
        public Promotion promotion;
        public PushFeedbackInfo push_feedback_info;
        public AlaLiveInfo recom_ala_info;
        public List<ThreadInfo> recom_thread_info;
        public RecommendBook recommend_book;
        public List<RecommendThread> recommend_threads;
        public List<SimpleForum> repost_recommend_forum_list;
        public String return_page;
        public RobotEntrance robot_entrance;
        public Integer scroll;
        public SdkTopicThread sdk_topic_thread;
        public String search_query;
        public Integer server_time;
        public SettingInfo setting_info;
        public ShareChatroom share_chatroom;
        public ForumShopGoodsInfo shop_goods_info;
        public Integer show_adsense;
        public SimilarContent similar_content;
        public Integer sort_type;
        public SpriteShowStrategy sprite_show_strategy;
        public SuggestQuery suggest_querys;
        public Integer switch_read_open;
        public List<TabInfo> tab_info;
        public ThreadInfo thread;
        public ThreadAlbumManage thread_album_manage;
        public Long thread_freq_num;
        public List<RecomTopicList> thread_topic;
        public PbTopAgreePost top_agree_post_list;
        public Post top_answer;
        public TwZhiBoAnti twzhibo_anti;
        public User user;
        public List<User> user_list;
        public WebviewData webview_data;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.user = dataRes.user;
            this.forum = dataRes.forum;
            this.page = dataRes.page;
            this.anti = dataRes.anti;
            this.add_post = dataRes.add_post;
            this.post_list = Message.copyOf(dataRes.post_list);
            this.has_floor = dataRes.has_floor;
            this.thread = dataRes.thread;
            this.location = dataRes.location;
            this.is_new_url = dataRes.is_new_url;
            this.post_banner = Message.copyOf(dataRes.post_banner);
            this.banner_list = dataRes.banner_list;
            this.user_list = Message.copyOf(dataRes.user_list);
            this.server_time = dataRes.server_time;
            this.news_info = dataRes.news_info;
            this.recommend_threads = Message.copyOf(dataRes.recommend_threads);
            this.fine_banner = Message.copyOf(dataRes.fine_banner);
            this.twzhibo_anti = dataRes.twzhibo_anti;
            this.sdk_topic_thread = dataRes.sdk_topic_thread;
            this.hot_post_list = dataRes.hot_post_list;
            this.graffiti_rank_list_info = dataRes.graffiti_rank_list_info;
            this.appeal_info = dataRes.appeal_info;
            this.god_card = dataRes.god_card;
            this.play_rank_list = Message.copyOf(dataRes.play_rank_list);
            this.recommend_book = dataRes.recommend_book;
            this.ala_info = dataRes.ala_info;
            this.forum_headline_img_info = dataRes.forum_headline_img_info;
            this.asp_shown_info = dataRes.asp_shown_info;
            this.guess_like = dataRes.guess_like;
            this.feed_thread_list = Message.copyOf(dataRes.feed_thread_list);
            this.is_follow_current_channel = dataRes.is_follow_current_channel;
            this.switch_read_open = dataRes.switch_read_open;
            this.feed_info = dataRes.feed_info;
            this.top_agree_post_list = dataRes.top_agree_post_list;
            this.repost_recommend_forum_list = Message.copyOf(dataRes.repost_recommend_forum_list);
            this.from_forum_list = Message.copyOf(dataRes.from_forum_list);
            this.thread_freq_num = dataRes.thread_freq_num;
            this.first_floor_post = dataRes.first_floor_post;
            this.display_forum = dataRes.display_forum;
            this.new_agree_user = Message.copyOf(dataRes.new_agree_user);
            this.partial_visible_toast = dataRes.partial_visible_toast;
            this.na_guide = dataRes.na_guide;
            this.follow_tip = dataRes.follow_tip;
            this.fold_tip = dataRes.fold_tip;
            this.exp_news_today = dataRes.exp_news_today;
            this.exp_guide_today = dataRes.exp_guide_today;
            this.multi_forum_text = dataRes.multi_forum_text;
            this.thread_topic = Message.copyOf(dataRes.thread_topic);
            this.pb_sort_info = Message.copyOf(dataRes.pb_sort_info);
            this.sort_type = dataRes.sort_type;
            this.manager_election = dataRes.manager_election;
            this.bjh_recommend = Message.copyOf(dataRes.bjh_recommend);
            this.business_promot_info = dataRes.business_promot_info;
            this.promotion = dataRes.promotion;
            this.recom_ala_info = dataRes.recom_ala_info;
            this.jumptotab1 = dataRes.jumptotab1;
            this.jumptotab2 = dataRes.jumptotab2;
            this.business_account_info = dataRes.business_account_info;
            this.recom_thread_info = Message.copyOf(dataRes.recom_thread_info);
            this.forum_rule = dataRes.forum_rule;
            this.show_adsense = dataRes.show_adsense;
            this.is_black_white = dataRes.is_black_white;
            this.is_official_forum = dataRes.is_official_forum;
            this.floating_icon = dataRes.floating_icon;
            this.is_purchase = dataRes.is_purchase;
            this.pb_notice_type = dataRes.pb_notice_type;
            this.pb_notice = dataRes.pb_notice;
            this.has_fold_comment = dataRes.has_fold_comment;
            this.fold_comment_num = dataRes.fold_comment_num;
            this.edit_config = dataRes.edit_config;
            this.edit_info = dataRes.edit_info;
            this.top_answer = dataRes.top_answer;
            this.jump_link_info = dataRes.jump_link_info;
            this.similar_content = dataRes.similar_content;
            this.robot_entrance = dataRes.robot_entrance;
            this.aichat_card = Message.copyOf(dataRes.aichat_card);
            this.share_chatroom = dataRes.share_chatroom;
            this.aichat_bot_card = dataRes.aichat_bot_card;
            this.push_feedback_info = dataRes.push_feedback_info;
            this.log_param = Message.copyOf(dataRes.log_param);
            this.guide_word_list = Message.copyOf(dataRes.guide_word_list);
            this.limit_dialog_name = Message.copyOf(dataRes.limit_dialog_name);
            this.bottom_toast = dataRes.bottom_toast;
            this.breadcrumb_navigation = dataRes.breadcrumb_navigation;
            this.pb_game_pop = dataRes.pb_game_pop;
            this.ad_show_select = dataRes.ad_show_select;
            this.webview_data = dataRes.webview_data;
            this.tab_info = Message.copyOf(dataRes.tab_info);
            this.current_tab = dataRes.current_tab;
            this.search_query = dataRes.search_query;
            this.suggest_querys = dataRes.suggest_querys;
            this.game_detail = dataRes.game_detail;
            this.sprite_show_strategy = dataRes.sprite_show_strategy;
            this.return_page = dataRes.return_page;
            this.first_floor = dataRes.first_floor;
            this.placeholder_text = dataRes.placeholder_text;
            this.thread_album_manage = dataRes.thread_album_manage;
            this.scroll = dataRes.scroll;
            this.is_tid_white = dataRes.is_tid_white;
            this.input_hint = Message.copyOf(dataRes.input_hint);
            this.bawu_delete_reason = dataRes.bawu_delete_reason;
            this.mutli_aichat_bot_card = dataRes.mutli_aichat_bot_card;
            this.setting_info = dataRes.setting_info;
            this.shop_goods_info = dataRes.shop_goods_info;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.user = builder.user;
            this.forum = builder.forum;
            this.page = builder.page;
            this.anti = builder.anti;
            this.add_post = builder.add_post;
            List<Post> list = builder.post_list;
            if (list == null) {
                this.post_list = DEFAULT_POST_LIST;
            } else {
                this.post_list = Message.immutableCopyOf(list);
            }
            Integer num = builder.has_floor;
            if (num == null) {
                this.has_floor = DEFAULT_HAS_FLOOR;
            } else {
                this.has_floor = num;
            }
            this.thread = builder.thread;
            this.location = builder.location;
            Integer num2 = builder.is_new_url;
            if (num2 == null) {
                this.is_new_url = DEFAULT_IS_NEW_URL;
            } else {
                this.is_new_url = num2;
            }
            List<PostBanner> list2 = builder.post_banner;
            if (list2 == null) {
                this.post_banner = DEFAULT_POST_BANNER;
            } else {
                this.post_banner = Message.immutableCopyOf(list2);
            }
            this.banner_list = builder.banner_list;
            List<User> list3 = builder.user_list;
            if (list3 == null) {
                this.user_list = DEFAULT_USER_LIST;
            } else {
                this.user_list = Message.immutableCopyOf(list3);
            }
            Integer num3 = builder.server_time;
            if (num3 == null) {
                this.server_time = DEFAULT_SERVER_TIME;
            } else {
                this.server_time = num3;
            }
            this.news_info = builder.news_info;
            List<RecommendThread> list4 = builder.recommend_threads;
            if (list4 == null) {
                this.recommend_threads = DEFAULT_RECOMMEND_THREADS;
            } else {
                this.recommend_threads = Message.immutableCopyOf(list4);
            }
            List<FineBannerPb> list5 = builder.fine_banner;
            if (list5 == null) {
                this.fine_banner = DEFAULT_FINE_BANNER;
            } else {
                this.fine_banner = Message.immutableCopyOf(list5);
            }
            this.twzhibo_anti = builder.twzhibo_anti;
            this.sdk_topic_thread = builder.sdk_topic_thread;
            this.hot_post_list = builder.hot_post_list;
            this.graffiti_rank_list_info = builder.graffiti_rank_list_info;
            this.appeal_info = builder.appeal_info;
            this.god_card = builder.god_card;
            List<PsRankListItem> list6 = builder.play_rank_list;
            if (list6 == null) {
                this.play_rank_list = DEFAULT_PLAY_RANK_LIST;
            } else {
                this.play_rank_list = Message.immutableCopyOf(list6);
            }
            this.recommend_book = builder.recommend_book;
            this.ala_info = builder.ala_info;
            this.forum_headline_img_info = builder.forum_headline_img_info;
            String str = builder.asp_shown_info;
            if (str == null) {
                this.asp_shown_info = "";
            } else {
                this.asp_shown_info = str;
            }
            this.guess_like = builder.guess_like;
            List<ThreadInfo> list7 = builder.feed_thread_list;
            if (list7 == null) {
                this.feed_thread_list = DEFAULT_FEED_THREAD_LIST;
            } else {
                this.feed_thread_list = Message.immutableCopyOf(list7);
            }
            Integer num4 = builder.is_follow_current_channel;
            if (num4 == null) {
                this.is_follow_current_channel = DEFAULT_IS_FOLLOW_CURRENT_CHANNEL;
            } else {
                this.is_follow_current_channel = num4;
            }
            Integer num5 = builder.switch_read_open;
            if (num5 == null) {
                this.switch_read_open = DEFAULT_SWITCH_READ_OPEN;
            } else {
                this.switch_read_open = num5;
            }
            this.feed_info = builder.feed_info;
            this.top_agree_post_list = builder.top_agree_post_list;
            List<SimpleForum> list8 = builder.repost_recommend_forum_list;
            if (list8 == null) {
                this.repost_recommend_forum_list = DEFAULT_REPOST_RECOMMEND_FORUM_LIST;
            } else {
                this.repost_recommend_forum_list = Message.immutableCopyOf(list8);
            }
            List<SimpleForum> list9 = builder.from_forum_list;
            if (list9 == null) {
                this.from_forum_list = DEFAULT_FROM_FORUM_LIST;
            } else {
                this.from_forum_list = Message.immutableCopyOf(list9);
            }
            Long l = builder.thread_freq_num;
            if (l == null) {
                this.thread_freq_num = DEFAULT_THREAD_FREQ_NUM;
            } else {
                this.thread_freq_num = l;
            }
            this.first_floor_post = builder.first_floor_post;
            this.display_forum = builder.display_forum;
            List<SimpleUser> list10 = builder.new_agree_user;
            if (list10 == null) {
                this.new_agree_user = DEFAULT_NEW_AGREE_USER;
            } else {
                this.new_agree_user = Message.immutableCopyOf(list10);
            }
            String str2 = builder.partial_visible_toast;
            if (str2 == null) {
                this.partial_visible_toast = "";
            } else {
                this.partial_visible_toast = str2;
            }
            this.na_guide = builder.na_guide;
            this.follow_tip = builder.follow_tip;
            String str3 = builder.fold_tip;
            if (str3 == null) {
                this.fold_tip = "";
            } else {
                this.fold_tip = str3;
            }
            Integer num6 = builder.exp_news_today;
            if (num6 == null) {
                this.exp_news_today = DEFAULT_EXP_NEWS_TODAY;
            } else {
                this.exp_news_today = num6;
            }
            Integer num7 = builder.exp_guide_today;
            if (num7 == null) {
                this.exp_guide_today = DEFAULT_EXP_GUIDE_TODAY;
            } else {
                this.exp_guide_today = num7;
            }
            String str4 = builder.multi_forum_text;
            if (str4 == null) {
                this.multi_forum_text = "";
            } else {
                this.multi_forum_text = str4;
            }
            List<RecomTopicList> list11 = builder.thread_topic;
            if (list11 == null) {
                this.thread_topic = DEFAULT_THREAD_TOPIC;
            } else {
                this.thread_topic = Message.immutableCopyOf(list11);
            }
            List<PbSortType> list12 = builder.pb_sort_info;
            if (list12 == null) {
                this.pb_sort_info = DEFAULT_PB_SORT_INFO;
            } else {
                this.pb_sort_info = Message.immutableCopyOf(list12);
            }
            Integer num8 = builder.sort_type;
            if (num8 == null) {
                this.sort_type = DEFAULT_SORT_TYPE;
            } else {
                this.sort_type = num8;
            }
            this.manager_election = builder.manager_election;
            List<ThreadInfo> list13 = builder.bjh_recommend;
            if (list13 == null) {
                this.bjh_recommend = DEFAULT_BJH_RECOMMEND;
            } else {
                this.bjh_recommend = Message.immutableCopyOf(list13);
            }
            this.business_promot_info = builder.business_promot_info;
            this.promotion = builder.promotion;
            this.recom_ala_info = builder.recom_ala_info;
            Integer num9 = builder.jumptotab1;
            if (num9 == null) {
                this.jumptotab1 = DEFAULT_JUMPTOTAB1;
            } else {
                this.jumptotab1 = num9;
            }
            String str5 = builder.jumptotab2;
            if (str5 == null) {
                this.jumptotab2 = "";
            } else {
                this.jumptotab2 = str5;
            }
            this.business_account_info = builder.business_account_info;
            List<ThreadInfo> list14 = builder.recom_thread_info;
            if (list14 == null) {
                this.recom_thread_info = DEFAULT_RECOM_THREAD_INFO;
            } else {
                this.recom_thread_info = Message.immutableCopyOf(list14);
            }
            this.forum_rule = builder.forum_rule;
            Integer num10 = builder.show_adsense;
            if (num10 == null) {
                this.show_adsense = DEFAULT_SHOW_ADSENSE;
            } else {
                this.show_adsense = num10;
            }
            Integer num11 = builder.is_black_white;
            if (num11 == null) {
                this.is_black_white = DEFAULT_IS_BLACK_WHITE;
            } else {
                this.is_black_white = num11;
            }
            Integer num12 = builder.is_official_forum;
            if (num12 == null) {
                this.is_official_forum = DEFAULT_IS_OFFICIAL_FORUM;
            } else {
                this.is_official_forum = num12;
            }
            this.floating_icon = builder.floating_icon;
            Integer num13 = builder.is_purchase;
            if (num13 == null) {
                this.is_purchase = DEFAULT_IS_PURCHASE;
            } else {
                this.is_purchase = num13;
            }
            Integer num14 = builder.pb_notice_type;
            if (num14 == null) {
                this.pb_notice_type = DEFAULT_PB_NOTICE_TYPE;
            } else {
                this.pb_notice_type = num14;
            }
            String str6 = builder.pb_notice;
            if (str6 == null) {
                this.pb_notice = "";
            } else {
                this.pb_notice = str6;
            }
            Integer num15 = builder.has_fold_comment;
            if (num15 == null) {
                this.has_fold_comment = DEFAULT_HAS_FOLD_COMMENT;
            } else {
                this.has_fold_comment = num15;
            }
            Long l2 = builder.fold_comment_num;
            if (l2 == null) {
                this.fold_comment_num = DEFAULT_FOLD_COMMENT_NUM;
            } else {
                this.fold_comment_num = l2;
            }
            this.edit_config = builder.edit_config;
            this.edit_info = builder.edit_info;
            this.top_answer = builder.top_answer;
            this.jump_link_info = builder.jump_link_info;
            this.similar_content = builder.similar_content;
            this.robot_entrance = builder.robot_entrance;
            List<AiChatCard> list15 = builder.aichat_card;
            if (list15 == null) {
                this.aichat_card = DEFAULT_AICHAT_CARD;
            } else {
                this.aichat_card = Message.immutableCopyOf(list15);
            }
            this.share_chatroom = builder.share_chatroom;
            this.aichat_bot_card = builder.aichat_bot_card;
            this.push_feedback_info = builder.push_feedback_info;
            List<FeedKV> list16 = builder.log_param;
            if (list16 == null) {
                this.log_param = DEFAULT_LOG_PARAM;
            } else {
                this.log_param = Message.immutableCopyOf(list16);
            }
            List<GuideWordList> list17 = builder.guide_word_list;
            if (list17 == null) {
                this.guide_word_list = DEFAULT_GUIDE_WORD_LIST;
            } else {
                this.guide_word_list = Message.immutableCopyOf(list17);
            }
            List<String> list18 = builder.limit_dialog_name;
            if (list18 == null) {
                this.limit_dialog_name = DEFAULT_LIMIT_DIALOG_NAME;
            } else {
                this.limit_dialog_name = Message.immutableCopyOf(list18);
            }
            this.bottom_toast = builder.bottom_toast;
            this.breadcrumb_navigation = builder.breadcrumb_navigation;
            this.pb_game_pop = builder.pb_game_pop;
            Integer num16 = builder.ad_show_select;
            if (num16 == null) {
                this.ad_show_select = DEFAULT_AD_SHOW_SELECT;
            } else {
                this.ad_show_select = num16;
            }
            this.webview_data = builder.webview_data;
            List<TabInfo> list19 = builder.tab_info;
            if (list19 == null) {
                this.tab_info = DEFAULT_TAB_INFO;
            } else {
                this.tab_info = Message.immutableCopyOf(list19);
            }
            this.current_tab = builder.current_tab;
            String str7 = builder.search_query;
            if (str7 == null) {
                this.search_query = "";
            } else {
                this.search_query = str7;
            }
            this.suggest_querys = builder.suggest_querys;
            this.game_detail = builder.game_detail;
            this.sprite_show_strategy = builder.sprite_show_strategy;
            String str8 = builder.return_page;
            if (str8 == null) {
                this.return_page = "";
            } else {
                this.return_page = str8;
            }
            this.first_floor = builder.first_floor;
            this.placeholder_text = builder.placeholder_text;
            this.thread_album_manage = builder.thread_album_manage;
            Integer num17 = builder.scroll;
            if (num17 == null) {
                this.scroll = DEFAULT_SCROLL;
            } else {
                this.scroll = num17;
            }
            Integer num18 = builder.is_tid_white;
            if (num18 == null) {
                this.is_tid_white = DEFAULT_IS_TID_WHITE;
            } else {
                this.is_tid_white = num18;
            }
            List<InputHintItem> list20 = builder.input_hint;
            if (list20 == null) {
                this.input_hint = DEFAULT_INPUT_HINT;
            } else {
                this.input_hint = Message.immutableCopyOf(list20);
            }
            this.bawu_delete_reason = builder.bawu_delete_reason;
            this.mutli_aichat_bot_card = builder.mutli_aichat_bot_card;
            this.setting_info = builder.setting_info;
            this.shop_goods_info = builder.shop_goods_info;
            return;
        }
        this.user = builder.user;
        this.forum = builder.forum;
        this.page = builder.page;
        this.anti = builder.anti;
        this.add_post = builder.add_post;
        this.post_list = Message.immutableCopyOf(builder.post_list);
        this.has_floor = builder.has_floor;
        this.thread = builder.thread;
        this.location = builder.location;
        this.is_new_url = builder.is_new_url;
        this.post_banner = Message.immutableCopyOf(builder.post_banner);
        this.banner_list = builder.banner_list;
        this.user_list = Message.immutableCopyOf(builder.user_list);
        this.server_time = builder.server_time;
        this.news_info = builder.news_info;
        this.recommend_threads = Message.immutableCopyOf(builder.recommend_threads);
        this.fine_banner = Message.immutableCopyOf(builder.fine_banner);
        this.twzhibo_anti = builder.twzhibo_anti;
        this.sdk_topic_thread = builder.sdk_topic_thread;
        this.hot_post_list = builder.hot_post_list;
        this.graffiti_rank_list_info = builder.graffiti_rank_list_info;
        this.appeal_info = builder.appeal_info;
        this.god_card = builder.god_card;
        this.play_rank_list = Message.immutableCopyOf(builder.play_rank_list);
        this.recommend_book = builder.recommend_book;
        this.ala_info = builder.ala_info;
        this.forum_headline_img_info = builder.forum_headline_img_info;
        this.asp_shown_info = builder.asp_shown_info;
        this.guess_like = builder.guess_like;
        this.feed_thread_list = Message.immutableCopyOf(builder.feed_thread_list);
        this.is_follow_current_channel = builder.is_follow_current_channel;
        this.switch_read_open = builder.switch_read_open;
        this.feed_info = builder.feed_info;
        this.top_agree_post_list = builder.top_agree_post_list;
        this.repost_recommend_forum_list = Message.immutableCopyOf(builder.repost_recommend_forum_list);
        this.from_forum_list = Message.immutableCopyOf(builder.from_forum_list);
        this.thread_freq_num = builder.thread_freq_num;
        this.first_floor_post = builder.first_floor_post;
        this.display_forum = builder.display_forum;
        this.new_agree_user = Message.immutableCopyOf(builder.new_agree_user);
        this.partial_visible_toast = builder.partial_visible_toast;
        this.na_guide = builder.na_guide;
        this.follow_tip = builder.follow_tip;
        this.fold_tip = builder.fold_tip;
        this.exp_news_today = builder.exp_news_today;
        this.exp_guide_today = builder.exp_guide_today;
        this.multi_forum_text = builder.multi_forum_text;
        this.thread_topic = Message.immutableCopyOf(builder.thread_topic);
        this.pb_sort_info = Message.immutableCopyOf(builder.pb_sort_info);
        this.sort_type = builder.sort_type;
        this.manager_election = builder.manager_election;
        this.bjh_recommend = Message.immutableCopyOf(builder.bjh_recommend);
        this.business_promot_info = builder.business_promot_info;
        this.promotion = builder.promotion;
        this.recom_ala_info = builder.recom_ala_info;
        this.jumptotab1 = builder.jumptotab1;
        this.jumptotab2 = builder.jumptotab2;
        this.business_account_info = builder.business_account_info;
        this.recom_thread_info = Message.immutableCopyOf(builder.recom_thread_info);
        this.forum_rule = builder.forum_rule;
        this.show_adsense = builder.show_adsense;
        this.is_black_white = builder.is_black_white;
        this.is_official_forum = builder.is_official_forum;
        this.floating_icon = builder.floating_icon;
        this.is_purchase = builder.is_purchase;
        this.pb_notice_type = builder.pb_notice_type;
        this.pb_notice = builder.pb_notice;
        this.has_fold_comment = builder.has_fold_comment;
        this.fold_comment_num = builder.fold_comment_num;
        this.edit_config = builder.edit_config;
        this.edit_info = builder.edit_info;
        this.top_answer = builder.top_answer;
        this.jump_link_info = builder.jump_link_info;
        this.similar_content = builder.similar_content;
        this.robot_entrance = builder.robot_entrance;
        this.aichat_card = Message.immutableCopyOf(builder.aichat_card);
        this.share_chatroom = builder.share_chatroom;
        this.aichat_bot_card = builder.aichat_bot_card;
        this.push_feedback_info = builder.push_feedback_info;
        this.log_param = Message.immutableCopyOf(builder.log_param);
        this.guide_word_list = Message.immutableCopyOf(builder.guide_word_list);
        this.limit_dialog_name = Message.immutableCopyOf(builder.limit_dialog_name);
        this.bottom_toast = builder.bottom_toast;
        this.breadcrumb_navigation = builder.breadcrumb_navigation;
        this.pb_game_pop = builder.pb_game_pop;
        this.ad_show_select = builder.ad_show_select;
        this.webview_data = builder.webview_data;
        this.tab_info = Message.immutableCopyOf(builder.tab_info);
        this.current_tab = builder.current_tab;
        this.search_query = builder.search_query;
        this.suggest_querys = builder.suggest_querys;
        this.game_detail = builder.game_detail;
        this.sprite_show_strategy = builder.sprite_show_strategy;
        this.return_page = builder.return_page;
        this.first_floor = builder.first_floor;
        this.placeholder_text = builder.placeholder_text;
        this.thread_album_manage = builder.thread_album_manage;
        this.scroll = builder.scroll;
        this.is_tid_white = builder.is_tid_white;
        this.input_hint = Message.immutableCopyOf(builder.input_hint);
        this.bawu_delete_reason = builder.bawu_delete_reason;
        this.mutli_aichat_bot_card = builder.mutli_aichat_bot_card;
        this.setting_info = builder.setting_info;
        this.shop_goods_info = builder.shop_goods_info;
    }
}