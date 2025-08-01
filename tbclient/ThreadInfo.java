package tbclient;

import com.baidu.android.imsdk.internal.Constants;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class ThreadInfo extends Message {
    public static final String DEFAULT_AB_TAG = "";
    public static final String DEFAULT_ARTICLE_COVER = "";
    public static final String DEFAULT_CATEGORY_NAME = "";
    public static final String DEFAULT_CLICK_MONITOR_URL = "";
    public static final String DEFAULT_CLICK_URL = "";
    public static final String DEFAULT_COLLECT_MARK_PID = "";
    public static final String DEFAULT_CONVERT_BTN_TYPE = "";
    public static final String DEFAULT_DAILY_PAPER_TIME = "";
    public static final String DEFAULT_DISABLE_SHARE_TOAST = "";
    public static final String DEFAULT_ECOM = "";
    public static final String DEFAULT_EXPOSURE_MONITOR_URL = "";
    public static final String DEFAULT_FEED_NID = "";
    public static final String DEFAULT_FNAME = "";
    public static final String DEFAULT_FORUM_USER_LIVE_MSG = "";
    public static final String DEFAULT_FROM = "";
    public static final String DEFAULT_GAME_EXT = "";
    public static final String DEFAULT_HEAD_TYPE = "";
    public static final String DEFAULT_IF_COMMENT_INFO = "";
    public static final String DEFAULT_IS_TIEBAPLUS_AD = "";
    public static final String DEFAULT_IS_TOP_IMG = "";
    public static final String DEFAULT_LAST_TIME = "";
    public static final String DEFAULT_LEGO_CARD = "";
    public static final String DEFAULT_LIVECOVER_SRC = "";
    public static final String DEFAULT_LIVE_POST_TYPE = "";
    public static final String DEFAULT_MEIZHI_PIC = "";
    public static final String DEFAULT_MULTI_FORUM_TEXT = "";
    public static final String DEFAULT_NID = "";
    public static final String DEFAULT_PIDS = "";
    public static final String DEFAULT_PLACEHOLDER_CARD_ID = "";
    public static final String DEFAULT_PRESENTATION_STYLE = "";
    public static final String DEFAULT_RECOM_EXTRA = "";
    public static final String DEFAULT_RECOM_REASON = "";
    public static final String DEFAULT_RECOM_SOURCE = "";
    public static final String DEFAULT_RECOM_TAG_ICON = "";
    public static final String DEFAULT_RECOM_WEIGHT = "";
    public static final String DEFAULT_SCARD_PACKET_ID = "";
    public static final String DEFAULT_SHARE_URL = "";
    public static final String DEFAULT_SHOW_EXT_STR = "";
    public static final String DEFAULT_TAB_NAME = "";
    public static final String DEFAULT_TARGET_SCHEME = "";
    public static final String DEFAULT_THREAD_SHARE_LINK = "";
    public static final String DEFAULT_TIEBAPLUS_EXTRA_PARAM = "";
    public static final String DEFAULT_TIEBAPLUS_ORDER_ID = "";
    public static final String DEFAULT_TIEBAPLUS_TOKEN = "";
    public static final String DEFAULT_TIEBA_GAME_INFORMATION_SOURCE = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_TITLE_AI = "";
    public static final String DEFAULT_TOPIC_H5_URL = "";
    public static final String DEFAULT_TOPIC_USER_NAME = "";
    public static final String DEFAULT_T_SHARE_IMG = "";
    public static final String DEFAULT_VIDEO = "";
    public static final String DEFAULT_VIDEO_COVER = "";
    public static final String DEFAULT_VIDEO_ID = "";
    public static final String DEFAULT_VIDEO_MOBILE_URL = "";
    public static final String DEFAULT_VIDEO_SWF = "";
    public static final String DEFAULT_WONDERFUL_POST_INFO = "";

    @ProtoField(label = Message.Label.REPEATED, tag = 21)
    public final List<Abstract> _abstract;

    @ProtoField(tag = 108, type = Message.Datatype.STRING)
    public final String ab_tag;

    @ProtoField(tag = 215)
    public final ThreadAblum ablum_info;

    @ProtoField(label = Message.Label.REPEATED, tag = 65)
    public final List<ActInfo> act_info;

    @ProtoField(tag = 132)
    public final ActivityInfo activity_info;

    @ProtoField(tag = 126)
    public final Agree agree;

    @ProtoField(tag = 124, type = Message.Datatype.INT32)
    public final Integer agree_num;

    @ProtoField(tag = 235)
    public final AichatBotCard aichat_bot_card;

    @ProtoField(tag = 113)
    public final AlaLiveInfo ala_info;

    @ProtoField(tag = 55)
    public final AnchorInfo anchor_info;

    @ProtoField(tag = 99)
    public final AnimationThread animation_info;

    @ProtoField(tag = 89)
    public final AppCode app_code;

    @ProtoField(tag = 117)
    public final AppInfo app_info;

    @ProtoField(tag = 162, type = Message.Datatype.STRING)
    public final String article_cover;

    @ProtoField(tag = 138, type = Message.Datatype.INT64)
    public final Long audit_time;

    @ProtoField(tag = 18)
    public final User author;

    @ProtoField(tag = 56, type = Message.Datatype.INT64)
    public final Long author_id;

    @ProtoField(tag = 169)
    public final Baijiahao baijiahao;

    @ProtoField(tag = 163, type = Message.Datatype.INT32)
    public final Integer bjh_content_tag;

    @ProtoField(tag = 102)
    public final BookThread book_chapter;

    @ProtoField(tag = Constants.METHOD_MEDIA_NOTIFY, type = Message.Datatype.INT64)
    public final Long book_id;

    @ProtoField(tag = 232)
    public final BusinessMix business_mix;

    @ProtoField(tag = 92)
    public final CartoonThread cartoon_info;

    @ProtoField(tag = 73, type = Message.Datatype.STRING)
    public final String category_name;

    @ProtoField(tag = 233)
    public final ChatPrivate chat_private;

    @ProtoField(tag = 107, type = Message.Datatype.UINT32)
    public final Integer cheak_repeat;

    @ProtoField(tag = 223)
    public final ClickBackCard click_back_card;

    @ProtoField(tag = 206, type = Message.Datatype.STRING)
    public final String click_monitor_url;

    @ProtoField(tag = 32, type = Message.Datatype.STRING)
    public final String click_url;

    @ProtoField(tag = 51, type = Message.Datatype.STRING)
    public final String collect_mark_pid;

    @ProtoField(tag = 190, type = Message.Datatype.UINT32)
    public final Integer collect_num;

    @ProtoField(tag = 50, type = Message.Datatype.INT32)
    public final Integer collect_status;

    @ProtoField(tag = 20, type = Message.Datatype.INT32)
    public final Integer comment_num;

    @ProtoField(tag = 218, type = Message.Datatype.STRING)
    public final String convert_btn_type;

    @ProtoField(tag = 45, type = Message.Datatype.INT32)
    public final Integer create_time;

    @ProtoField(tag = 211)
    public final CustomFigure custom_figure;

    @ProtoField(tag = 212)
    public final CustomState custom_state;

    @ProtoField(tag = 154, type = Message.Datatype.STRING)
    public final String daily_paper_time;

    @ProtoField(tag = 98)
    public final DealInfo deal_info;

    @ProtoField(label = Message.Label.REPEATED, tag = 121)
    public final List<DeclareInfo> declare_list;

    @ProtoField(tag = 240, type = Message.Datatype.INT64)
    public final Long disable_reply;

    @ProtoField(tag = 228, type = Message.Datatype.INT64)
    public final Long disable_share;

    @ProtoField(tag = 229, type = Message.Datatype.STRING)
    public final String disable_share_toast;

    @ProtoField(label = Message.Label.REPEATED, tag = 120)
    public final List<DislikeInfo> dislike_info;

    @ProtoField(tag = 249)
    public final ThreadDrawInfo draw_info;

    @ProtoField(tag = 60, type = Message.Datatype.STRING)
    public final String ecom;

    @ProtoField(tag = 203)
    public final EditInfo edit_info;

    @ProtoField(tag = 205, type = Message.Datatype.STRING)
    public final String exposure_monitor_url;

    @ProtoField(label = Message.Label.REPEATED, tag = 90)
    public final List<TailInfo> ext_tails;

    @ProtoField(tag = 257, type = Message.Datatype.STRING)
    public final String feed_nid;

    @ProtoField(tag = 27, type = Message.Datatype.INT64)
    public final Long fid;

    @ProtoField(label = Message.Label.REPEATED, tag = 142)
    public final List<PbContent> first_post_content;

    @ProtoField(tag = 40, type = Message.Datatype.INT64)
    public final Long first_post_id;

    @ProtoField(tag = 28, type = Message.Datatype.STRING)
    public final String fname;

    @ProtoField(tag = 188)
    public final ForumFriendWatchingInfo forum_friend_watching_info;

    @ProtoField(tag = 155)
    public final SimpleForum forum_info;

    @ProtoField(tag = 187, type = Message.Datatype.STRING)
    public final String forum_user_live_msg;

    @ProtoField(tag = 130, type = Message.Datatype.INT64)
    public final Long freq_num;

    @ProtoField(tag = 49, type = Message.Datatype.STRING)
    public final String from;

    @ProtoField(label = Message.Label.REPEATED, tag = 247)
    public final List<Post> full_post_list;

    @ProtoField(tag = Constants.METHOD_IM_CONSULT_IM_UPDATE_MSG, type = Message.Datatype.STRING)
    public final String game_ext;

    @ProtoField(tag = 63)
    public final Guess guess;

    @ProtoField(tag = 48, type = Message.Datatype.INT32)
    public final Integer has_commented;

    @ProtoField(tag = 227, type = Message.Datatype.STRING)
    public final String head_type;

    @ProtoField(tag = 95)
    public final TogetherHi high_together;

    @ProtoField(tag = 71)
    public final HotTWThreadInfo hotTWInfo;

    @ProtoField(tag = 182, type = Message.Datatype.INT32)
    public final Integer hot_num;

    @ProtoField(label = Message.Label.REPEATED, tag = 221)
    public final List<Post> hot_post_list;

    @ProtoField(tag = 66, type = Message.Datatype.INT32)
    public final Integer hot_weight;

    @ProtoField(tag = 250)
    public final Post hotest_post;

    @ProtoField(label = Message.Label.REPEATED, tag = Constants.METHOD_IM_CONSULT_NOTIFY_MSG)
    public final List<IconMark> icon_mark;

    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long id;

    @ProtoField(tag = 173, type = Message.Datatype.INT32)
    public final Integer if_comment;

    @ProtoField(tag = 174, type = Message.Datatype.STRING)
    public final String if_comment_info;

    @ProtoField(tag = 58, type = Message.Datatype.UINT32)
    public final Integer isLzDeleteAll;

    @ProtoField(tag = 16, type = Message.Datatype.INT32)
    public final Integer is_activity;

    @ProtoField(tag = 59, type = Message.Datatype.UINT32)
    public final Integer is_ad;

    @ProtoField(tag = 186, type = Message.Datatype.INT32)
    public final Integer is_author_view;

    @ProtoField(tag = 12, type = Message.Datatype.INT32)
    public final Integer is_bakan;

    @ProtoField(tag = 161, type = Message.Datatype.INT32)
    public final Integer is_bjh;

    @ProtoField(tag = 103, type = Message.Datatype.UINT32)
    public final Integer is_book_chapter;

    @ProtoField(tag = 39, type = Message.Datatype.INT32)
    public final Integer is_bub;

    @ProtoField(tag = 136, type = Message.Datatype.INT32)
    public final Integer is_called;

    @ProtoField(tag = 81, type = Message.Datatype.UINT32)
    public final Integer is_copythread;

    @ProtoField(tag = 97, type = Message.Datatype.INT32)
    public final Integer is_deal;

    @ProtoField(tag = 181, type = Message.Datatype.INT32)
    public final Integer is_deleted;

    @ProtoField(tag = 219, type = Message.Datatype.INT32)
    public final Integer is_excellent_thread;

    @ProtoField(tag = 198, type = Message.Datatype.INT32)
    public final Integer is_frs_mask;

    @ProtoField(tag = 42, type = Message.Datatype.INT32)
    public final Integer is_global_top;

    @ProtoField(tag = 131, type = Message.Datatype.INT32)
    public final Integer is_god;

    @ProtoField(tag = 85, type = Message.Datatype.INT32)
    public final Integer is_godthread_recommend;

    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer is_good;

    @ProtoField(tag = 165, type = Message.Datatype.INT32)
    public final Integer is_headlinepost;

    @ProtoField(tag = 213, type = Message.Datatype.INT32)
    public final Integer is_highlight;

    @ProtoField(tag = Constants.METHOD_IM_CONSULT_IM_FILTER_SESSION_MSG, type = Message.Datatype.BOOL)
    public final Boolean is_hottop_thread;

    @ProtoField(tag = 128, type = Message.Datatype.INT32)
    public final Integer is_link_thread;

    @ProtoField(tag = 30, type = Message.Datatype.INT32)
    public final Integer is_livepost;

    @ProtoField(tag = 184, type = Message.Datatype.UINT32)
    public final Integer is_local;

    @ProtoField(tag = 14, type = Message.Datatype.INT32)
    public final Integer is_meizhi;

    @ProtoField(tag = 54, type = Message.Datatype.INT32)
    public final Integer is_membertop;

    @ProtoField(tag = 123, type = Message.Datatype.INT32)
    public final Integer is_multiforum_thread;

    @ProtoField(tag = 17, type = Message.Datatype.INT32)
    public final Integer is_notice;

    @ProtoField(tag = 76, type = Message.Datatype.INT32)
    public final Integer is_novel;

    @ProtoField(tag = 78, type = Message.Datatype.INT32)
    public final Integer is_novel_reward;

    @ProtoField(tag = 77, type = Message.Datatype.INT32)
    public final Integer is_novel_thank;

    @ProtoField(tag = 38, type = Message.Datatype.INT32)
    public final Integer is_ntitle;

    @ProtoField(tag = 114, type = Message.Datatype.UINT32)
    public final Integer is_operate_thread;

    @ProtoField(tag = 127, type = Message.Datatype.INT32)
    public final Integer is_partial_visible;

    @ProtoField(tag = 43, type = Message.Datatype.INT32)
    public final Integer is_pic;

    @ProtoField(tag = 204, type = Message.Datatype.INT32)
    public final Integer is_pictxt;

    @ProtoField(tag = 13, type = Message.Datatype.INT32)
    public final Integer is_protal;

    @ProtoField(tag = Constants.METHOD_IM_GET_USER_PROFILE_BY_BAIDU_UID, type = Message.Datatype.UINT32)
    public final Integer is_s_card;

    @ProtoField(tag = 143, type = Message.Datatype.INT32)
    public final Integer is_share_thread;

    @ProtoField(tag = 134, type = Message.Datatype.INT32)
    public final Integer is_story_audit;

    @ProtoField(tag = 115, type = Message.Datatype.INT32)
    public final Integer is_tbread_dispatch;

    @ProtoField(tag = 193, type = Message.Datatype.STRING)
    public final String is_tiebaplus_ad;

    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer is_top;

    @ProtoField(tag = 158, type = Message.Datatype.STRING)
    public final String is_top_img;

    @ProtoField(tag = 148, type = Message.Datatype.INT32)
    public final Integer is_topic;

    @ProtoField(tag = 153, type = Message.Datatype.INT32)
    public final Integer is_videobiggie_recomthread;

    @ProtoField(tag = 15, type = Message.Datatype.INT32)
    public final Integer is_voice_thread;

    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer is_vote;

    @ProtoField(tag = 214, type = Message.Datatype.INT32)
    public final Integer is_xiuxiu_thread;

    @ProtoField(tag = 179)
    public final Item item;

    @ProtoField(label = Message.Label.REPEATED, tag = 180)
    public final List<HeadItem> item_star;

    @ProtoField(tag = 75)
    public final JNews jid;

    @ProtoField(tag = 106, type = Message.Datatype.UINT64)
    public final Long last_read_pid;

    @ProtoField(tag = 19)
    public final User last_replyer;

    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String last_time;

    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer last_time_int;

    @ProtoField(tag = 94, type = Message.Datatype.STRING)
    public final String lego_card;

    @ProtoField(tag = 129)
    public final LinkThreadInfo link_info;

    @ProtoField(tag = 220, type = Message.Datatype.INT32)
    public final Integer literature_flag;

    @ProtoField(tag = 29, type = Message.Datatype.STRING)
    public final String live_post_type;

    @ProtoField(tag = 67, type = Message.Datatype.STRING)
    public final String livecover_src;

    @ProtoField(tag = 62)
    public final Lbs location;

    @ProtoField(label = Message.Label.REPEATED, tag = 234)
    public final List<FeedKV> log_param;

    @ProtoField(label = Message.Label.REPEATED, tag = 22)
    public final List<Media> media;

    @ProtoField(label = Message.Label.REPEATED, tag = 25)
    public final List<MediaNum> media_num;

    @ProtoField(tag = 24, type = Message.Datatype.STRING)
    public final String meizhi_pic;

    @ProtoField(tag = 139, type = Message.Datatype.INT32)
    public final Integer middle_page_num;

    @ProtoField(tag = 140, type = Message.Datatype.INT32)
    public final Integer middle_page_pass_flag;

    @ProtoField(tag = 146, type = Message.Datatype.STRING)
    public final String multi_forum_text;

    @ProtoField(label = Message.Label.REPEATED, tag = 122)
    public final List<MultipleForum> multiple_forum_list;

    @ProtoField(tag = 156)
    public final SmartApp naws_info;

    @ProtoField(tag = 164, type = Message.Datatype.STRING)
    public final String nid;

    @ProtoField(tag = 82, type = Message.Datatype.UINT32)
    public final Integer operator_flag;

    @ProtoField(tag = 152)
    public final OriForumInfo ori_forum_info;

    @ProtoField(tag = 141)
    public final OriginThreadInfo origin_thread_info;

    @ProtoField(tag = 185, type = Message.Datatype.INT32)
    public final Integer pb_entry;

    @ProtoField(label = Message.Label.REPEATED, tag = 183)
    public final List<PbGoodsInfo> pb_goods_info;

    @ProtoField(label = Message.Label.REPEATED, tag = 178)
    public final List<PbLinkInfo> pb_link_info;

    @ProtoField(tag = 224)
    public final PeiwanInfo peiwan_info;

    @ProtoField(tag = 133)
    public final Media pic_info;

    @ProtoField(tag = 84, type = Message.Datatype.UINT32)
    public final Integer pic_num;

    @ProtoField(tag = 61, type = Message.Datatype.STRING)
    public final String pids;

    @ProtoField(tag = 238, type = Message.Datatype.STRING)
    public final String placeholder_card_id;

    @ProtoField(tag = 74)
    public final PollInfo poll_info;

    @ProtoField(tag = 256, type = Message.Datatype.INT32)
    public final Integer poll_style;

    @ProtoField(tag = 52, type = Message.Datatype.INT64)
    public final Long post_id;

    @ProtoField(label = Message.Label.REPEATED, tag = 44)
    public final List<PostList> post_list;

    @ProtoField(tag = 69, type = Message.Datatype.INT32)
    public final Integer post_num;

    @ProtoField(tag = 151, type = Message.Datatype.STRING)
    public final String presentation_style;

    @ProtoField(tag = 101)
    public final PsInfo ps_info;

    @ProtoField(tag = 80, type = Message.Datatype.INT32)
    public final Integer push_end_time;

    @ProtoField(tag = 91)
    public final PushStatus push_status;

    @ProtoField(tag = 252)
    public final QuestionBonus question_bonus;

    @ProtoField(tag = 207, type = Message.Datatype.INT32)
    public final Integer readonly;

    @ProtoField(tag = 144, type = Message.Datatype.STRING)
    public final String recom_extra;

    @ProtoField(tag = 109, type = Message.Datatype.STRING)
    public final String recom_reason;

    @ProtoField(tag = 104, type = Message.Datatype.STRING)
    public final String recom_source;

    @ProtoField(tag = 192, type = Message.Datatype.STRING)
    public final String recom_tag_icon;

    @ProtoField(tag = 105, type = Message.Datatype.STRING)
    public final String recom_weight;

    @ProtoField(tag = 202)
    public final RecommendTip recommend_tip;

    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer reply_num;

    @ProtoField(label = Message.Label.REPEATED, tag = 118)
    public final List<ReportInfo> report_info;

    @ProtoField(tag = 46, type = Message.Datatype.INT32)
    public final Integer repost_num;

    @ProtoField(label = Message.Label.REPEATED, tag = 112)
    public final List<PbContent> rich_abstract;

    @ProtoField(label = Message.Label.REPEATED, tag = 111)
    public final List<PbContent> rich_title;

    @ProtoField(tag = 222)
    public final RobotEntrance robot_entrance;

    @ProtoField(tag = 225, type = Message.Datatype.INT64)
    public final Long robot_thread_type;

    @ProtoField(tag = 171, type = Message.Datatype.STRING)
    public final String scard_packet_id;

    @ProtoField(tag = 241)
    public final ThreadScoreInfo score_info;

    @ProtoField(tag = 135, type = Message.Datatype.INT64)
    public final Long share_num;

    @ProtoField(tag = 230, type = Message.Datatype.STRING)
    public final String share_url;

    @ProtoField(tag = 216, type = Message.Datatype.UINT32)
    public final Integer show_ad_subscript;

    @ProtoField(tag = 31, type = Message.Datatype.INT32)
    public final Integer show_commented;

    @ProtoField(tag = 244, type = Message.Datatype.STRING)
    public final String show_ext_str;

    @ProtoField(tag = 245, type = Message.Datatype.INT32)
    public final Integer show_new_question_style;

    @ProtoField(tag = 242)
    public final ShowPostContent show_post_content;

    @ProtoField(label = Message.Label.REPEATED, tag = 243)
    public final List<User> show_user_list;

    @ProtoField(tag = 100)
    public final SkinInfo skin_info;

    @ProtoField(tag = 147)
    public final StarRankIcon star_rank_icon;

    @ProtoField(tag = 68, type = Message.Datatype.INT32)
    public final Integer storecount;

    @ProtoField(tag = 159, type = Message.Datatype.STRING)
    public final String t_share_img;

    @ProtoField(tag = 175, type = Message.Datatype.INT32)
    public final Integer tab_id;

    @ProtoField(tag = 176, type = Message.Datatype.STRING)
    public final String tab_name;

    @ProtoField(tag = 200, type = Message.Datatype.INT32)
    public final Integer tab_show_mode;

    @ProtoField(tag = 217, type = Message.Datatype.STRING)
    public final String target_scheme;

    @ProtoField(tag = 83)
    public final TaskInfo task_info;

    @ProtoField(tag = 116)
    public final TbreadDispatch tbread_dispatch_info;

    @ProtoField(tag = 248, type = Message.Datatype.INT32)
    public final Integer thread_album_id;

    @ProtoField(tag = 251, type = Message.Datatype.INT32)
    public final Integer thread_album_status;

    @ProtoField(label = Message.Label.REPEATED, tag = 191)
    public final List<ThreadRecommendInfo> thread_recommend_infos;

    @ProtoField(tag = 210)
    public final ThreadRecommendTag thread_recommend_tag;

    @ProtoField(tag = 172, type = Message.Datatype.STRING)
    public final String thread_share_link;

    @ProtoField(tag = 26, type = Message.Datatype.INT32)
    public final Integer thread_type;

    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer thread_types;

    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long tid;

    @ProtoField(tag = 137, type = Message.Datatype.STRING)
    public final String tieba_game_information_source;

    @ProtoField(tag = 201)
    public final TiebaPlusAd tiebaplus_ad;

    @ProtoField(tag = 197, type = Message.Datatype.INT32)
    public final Integer tiebaplus_cant_delete;

    @ProtoField(tag = 253, type = Message.Datatype.UINT32)
    public final Integer tiebaplus_da_type;

    @ProtoField(tag = 254, type = Message.Datatype.UINT32)
    public final Integer tiebaplus_da_type_click;

    @ProtoField(tag = 196, type = Message.Datatype.STRING)
    public final String tiebaplus_extra_param;

    @ProtoField(tag = 194, type = Message.Datatype.STRING)
    public final String tiebaplus_order_id;

    @ProtoField(tag = 195, type = Message.Datatype.STRING)
    public final String tiebaplus_token;

    @ProtoField(tag = 53, type = Message.Datatype.INT32)
    public final Integer time;

    @ProtoField(tag = 64, type = Message.Datatype.UINT32)
    public final Integer timeline;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String title;

    @ProtoField(tag = 246, type = Message.Datatype.STRING)
    public final String title_ai;

    @ProtoField(tag = 125)
    public final Post top_agree_post;

    @ProtoField(tag = 231, type = Message.Datatype.INT64)
    public final Long top_thread_set_time;

    @ProtoField(tag = 47)
    public final Topic topic;

    @ProtoField(tag = 150, type = Message.Datatype.STRING)
    public final String topic_h5_url;

    @ProtoField(tag = 160)
    public final TopicModule topic_module;

    @ProtoField(tag = TTDownloadField.CALL_DOWNLOAD_MODEL_SET_VERSION_CODE, type = Message.Datatype.STRING)
    public final String topic_user_name;

    @ProtoField(tag = 145, type = Message.Datatype.UINT64)
    public final Long trans_num;

    @ProtoField(tag = 72)
    public final ZhiBoInfoTW twzhibo_info;

    @ProtoField(tag = 57, type = Message.Datatype.UINT32)
    public final Integer valid_post_num;

    @ProtoField(tag = 33, type = Message.Datatype.STRING)
    public final String video;

    @ProtoField(tag = 110)
    public final AdInfo video_ad_info;

    @ProtoField(tag = 255)
    public final ThreadVideoCard video_card;

    @ProtoField(tag = 119)
    public final VideoChannelInfo video_channel_info;

    @ProtoField(tag = 35, type = Message.Datatype.STRING)
    public final String video_cover;

    @ProtoField(tag = 36, type = Message.Datatype.STRING)
    public final String video_id;

    @ProtoField(tag = 79)
    public final VideoInfo video_info;

    @ProtoField(tag = 37, type = Message.Datatype.STRING)
    public final String video_mobile_url;

    @ProtoField(tag = 259)
    public final ThreadVideoOtherInfo video_other_info;

    @ProtoField(tag = 157)
    public final VideoDesc video_segment;

    @ProtoField(tag = 34, type = Message.Datatype.STRING)
    public final String video_swf;

    @ProtoField(tag = 96)
    public final VideoActive videoactive_info;

    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer view_num;

    @ProtoField(label = Message.Label.REPEATED, tag = 23)
    public final List<Voice> voice_info;

    @ProtoField(tag = 199)
    public final VoiceRoom voice_room;

    @ProtoField(tag = 177, type = Message.Datatype.STRING)
    public final String wonderful_post_info;

    @ProtoField(tag = 189)
    public final WorksInfo works_info;

    @ProtoField(tag = 88)
    public final YulePostActivity yule_post_activity;

    @ProtoField(tag = 41)
    public final Zan zan;
    public static final Long DEFAULT_ID = 0L;
    public static final Long DEFAULT_TID = 0L;
    public static final Integer DEFAULT_REPLY_NUM = 0;
    public static final Integer DEFAULT_VIEW_NUM = 0;
    public static final Integer DEFAULT_LAST_TIME_INT = 0;
    public static final Integer DEFAULT_THREAD_TYPES = 0;
    public static final Integer DEFAULT_IS_TOP = 0;
    public static final Integer DEFAULT_IS_GOOD = 0;
    public static final Integer DEFAULT_IS_VOTE = 0;
    public static final Integer DEFAULT_IS_BAKAN = 0;
    public static final Integer DEFAULT_IS_PROTAL = 0;
    public static final Integer DEFAULT_IS_MEIZHI = 0;
    public static final Integer DEFAULT_IS_VOICE_THREAD = 0;
    public static final Integer DEFAULT_IS_ACTIVITY = 0;
    public static final Integer DEFAULT_IS_NOTICE = 0;
    public static final Integer DEFAULT_COMMENT_NUM = 0;
    public static final List<Abstract> DEFAULT_ABSTRACT = Collections.emptyList();
    public static final List<Media> DEFAULT_MEDIA = Collections.emptyList();
    public static final List<Voice> DEFAULT_VOICE_INFO = Collections.emptyList();
    public static final List<MediaNum> DEFAULT_MEDIA_NUM = Collections.emptyList();
    public static final Integer DEFAULT_THREAD_TYPE = 0;
    public static final Long DEFAULT_FID = 0L;
    public static final Integer DEFAULT_IS_LIVEPOST = 0;
    public static final Integer DEFAULT_SHOW_COMMENTED = 0;
    public static final Integer DEFAULT_IS_NTITLE = 0;
    public static final Integer DEFAULT_IS_BUB = 0;
    public static final Long DEFAULT_FIRST_POST_ID = 0L;
    public static final Integer DEFAULT_IS_GLOBAL_TOP = 0;
    public static final Integer DEFAULT_IS_PIC = 0;
    public static final List<PostList> DEFAULT_POST_LIST = Collections.emptyList();
    public static final Integer DEFAULT_CREATE_TIME = 0;
    public static final Integer DEFAULT_REPOST_NUM = 0;
    public static final Integer DEFAULT_HAS_COMMENTED = 0;
    public static final Integer DEFAULT_COLLECT_STATUS = 0;
    public static final Long DEFAULT_POST_ID = 0L;
    public static final Integer DEFAULT_TIME = 0;
    public static final Integer DEFAULT_IS_MEMBERTOP = 0;
    public static final Long DEFAULT_AUTHOR_ID = 0L;
    public static final Integer DEFAULT_VALID_POST_NUM = 0;
    public static final Integer DEFAULT_ISLZDELETEALL = 0;
    public static final Integer DEFAULT_IS_AD = 0;
    public static final Integer DEFAULT_TIMELINE = 0;
    public static final List<ActInfo> DEFAULT_ACT_INFO = Collections.emptyList();
    public static final Integer DEFAULT_HOT_WEIGHT = 0;
    public static final Integer DEFAULT_STORECOUNT = 0;
    public static final Integer DEFAULT_POST_NUM = 0;
    public static final Integer DEFAULT_IS_NOVEL = 0;
    public static final Integer DEFAULT_IS_NOVEL_THANK = 0;
    public static final Integer DEFAULT_IS_NOVEL_REWARD = 0;
    public static final Integer DEFAULT_PUSH_END_TIME = 0;
    public static final Integer DEFAULT_IS_COPYTHREAD = 0;
    public static final Integer DEFAULT_OPERATOR_FLAG = 0;
    public static final Integer DEFAULT_PIC_NUM = 0;
    public static final Integer DEFAULT_IS_GODTHREAD_RECOMMEND = 0;
    public static final List<TailInfo> DEFAULT_EXT_TAILS = Collections.emptyList();
    public static final Integer DEFAULT_IS_DEAL = 0;
    public static final Integer DEFAULT_IS_BOOK_CHAPTER = 0;
    public static final Long DEFAULT_LAST_READ_PID = 0L;
    public static final Integer DEFAULT_CHEAK_REPEAT = 0;
    public static final List<PbContent> DEFAULT_RICH_TITLE = Collections.emptyList();
    public static final List<PbContent> DEFAULT_RICH_ABSTRACT = Collections.emptyList();
    public static final Integer DEFAULT_IS_OPERATE_THREAD = 0;
    public static final Integer DEFAULT_IS_TBREAD_DISPATCH = 0;
    public static final List<ReportInfo> DEFAULT_REPORT_INFO = Collections.emptyList();
    public static final List<DislikeInfo> DEFAULT_DISLIKE_INFO = Collections.emptyList();
    public static final List<DeclareInfo> DEFAULT_DECLARE_LIST = Collections.emptyList();
    public static final List<MultipleForum> DEFAULT_MULTIPLE_FORUM_LIST = Collections.emptyList();
    public static final Integer DEFAULT_IS_MULTIFORUM_THREAD = 0;
    public static final Integer DEFAULT_AGREE_NUM = 0;
    public static final Integer DEFAULT_IS_PARTIAL_VISIBLE = 0;
    public static final Integer DEFAULT_IS_LINK_THREAD = 0;
    public static final Long DEFAULT_FREQ_NUM = 0L;
    public static final Integer DEFAULT_IS_GOD = 0;
    public static final Integer DEFAULT_IS_STORY_AUDIT = 0;
    public static final Long DEFAULT_SHARE_NUM = 0L;
    public static final Integer DEFAULT_IS_CALLED = 0;
    public static final Long DEFAULT_AUDIT_TIME = 0L;
    public static final Integer DEFAULT_MIDDLE_PAGE_NUM = 0;
    public static final Integer DEFAULT_MIDDLE_PAGE_PASS_FLAG = 0;
    public static final List<PbContent> DEFAULT_FIRST_POST_CONTENT = Collections.emptyList();
    public static final Integer DEFAULT_IS_SHARE_THREAD = 0;
    public static final Long DEFAULT_TRANS_NUM = 0L;
    public static final Integer DEFAULT_IS_TOPIC = 0;
    public static final Integer DEFAULT_IS_VIDEOBIGGIE_RECOMTHREAD = 0;
    public static final Integer DEFAULT_IS_BJH = 0;
    public static final Integer DEFAULT_BJH_CONTENT_TAG = 0;
    public static final Integer DEFAULT_IS_HEADLINEPOST = 0;
    public static final Integer DEFAULT_IS_S_CARD = 0;
    public static final Integer DEFAULT_IF_COMMENT = 0;
    public static final Integer DEFAULT_TAB_ID = 0;
    public static final List<PbLinkInfo> DEFAULT_PB_LINK_INFO = Collections.emptyList();
    public static final List<HeadItem> DEFAULT_ITEM_STAR = Collections.emptyList();
    public static final Integer DEFAULT_IS_DELETED = 0;
    public static final Integer DEFAULT_HOT_NUM = 0;
    public static final List<PbGoodsInfo> DEFAULT_PB_GOODS_INFO = Collections.emptyList();
    public static final Integer DEFAULT_IS_LOCAL = 0;
    public static final Integer DEFAULT_PB_ENTRY = 0;
    public static final Integer DEFAULT_IS_AUTHOR_VIEW = 0;
    public static final Integer DEFAULT_COLLECT_NUM = 0;
    public static final List<ThreadRecommendInfo> DEFAULT_THREAD_RECOMMEND_INFOS = Collections.emptyList();
    public static final Integer DEFAULT_TIEBAPLUS_CANT_DELETE = 0;
    public static final Integer DEFAULT_IS_FRS_MASK = 0;
    public static final Integer DEFAULT_TAB_SHOW_MODE = 0;
    public static final Integer DEFAULT_IS_PICTXT = 0;
    public static final Integer DEFAULT_READONLY = 0;
    public static final Integer DEFAULT_IS_HIGHLIGHT = 0;
    public static final Integer DEFAULT_IS_XIUXIU_THREAD = 0;
    public static final Integer DEFAULT_SHOW_AD_SUBSCRIPT = 0;
    public static final Integer DEFAULT_IS_EXCELLENT_THREAD = 0;
    public static final Integer DEFAULT_LITERATURE_FLAG = 0;
    public static final List<Post> DEFAULT_HOT_POST_LIST = Collections.emptyList();
    public static final Long DEFAULT_ROBOT_THREAD_TYPE = 0L;
    public static final Long DEFAULT_BOOK_ID = 0L;
    public static final Long DEFAULT_DISABLE_SHARE = 0L;
    public static final Long DEFAULT_TOP_THREAD_SET_TIME = 0L;
    public static final List<FeedKV> DEFAULT_LOG_PARAM = Collections.emptyList();
    public static final List<IconMark> DEFAULT_ICON_MARK = Collections.emptyList();
    public static final Boolean DEFAULT_IS_HOTTOP_THREAD = Boolean.FALSE;
    public static final Long DEFAULT_DISABLE_REPLY = 0L;
    public static final List<User> DEFAULT_SHOW_USER_LIST = Collections.emptyList();
    public static final Integer DEFAULT_SHOW_NEW_QUESTION_STYLE = 0;
    public static final List<Post> DEFAULT_FULL_POST_LIST = Collections.emptyList();
    public static final Integer DEFAULT_THREAD_ALBUM_ID = 0;
    public static final Integer DEFAULT_THREAD_ALBUM_STATUS = 0;
    public static final Integer DEFAULT_TIEBAPLUS_DA_TYPE = 0;
    public static final Integer DEFAULT_TIEBAPLUS_DA_TYPE_CLICK = 0;
    public static final Integer DEFAULT_POLL_STYLE = 0;

    public ThreadInfo(Builder builder, boolean z) {
        super(builder);
        if (!z) {
            this.id = builder.id;
            this.tid = builder.tid;
            this.title = builder.title;
            this.reply_num = builder.reply_num;
            this.view_num = builder.view_num;
            this.last_time = builder.last_time;
            this.last_time_int = builder.last_time_int;
            this.thread_types = builder.thread_types;
            this.is_top = builder.is_top;
            this.is_good = builder.is_good;
            this.is_vote = builder.is_vote;
            this.is_bakan = builder.is_bakan;
            this.is_protal = builder.is_protal;
            this.is_meizhi = builder.is_meizhi;
            this.is_voice_thread = builder.is_voice_thread;
            this.is_activity = builder.is_activity;
            this.is_notice = builder.is_notice;
            this.author = builder.author;
            this.last_replyer = builder.last_replyer;
            this.comment_num = builder.comment_num;
            this._abstract = Message.immutableCopyOf(builder._abstract);
            this.media = Message.immutableCopyOf(builder.media);
            this.voice_info = Message.immutableCopyOf(builder.voice_info);
            this.meizhi_pic = builder.meizhi_pic;
            this.media_num = Message.immutableCopyOf(builder.media_num);
            this.thread_type = builder.thread_type;
            this.fid = builder.fid;
            this.fname = builder.fname;
            this.live_post_type = builder.live_post_type;
            this.is_livepost = builder.is_livepost;
            this.show_commented = builder.show_commented;
            this.click_url = builder.click_url;
            this.video = builder.video;
            this.video_swf = builder.video_swf;
            this.video_cover = builder.video_cover;
            this.video_id = builder.video_id;
            this.video_mobile_url = builder.video_mobile_url;
            this.is_ntitle = builder.is_ntitle;
            this.is_bub = builder.is_bub;
            this.first_post_id = builder.first_post_id;
            this.zan = builder.zan;
            this.is_global_top = builder.is_global_top;
            this.is_pic = builder.is_pic;
            this.post_list = Message.immutableCopyOf(builder.post_list);
            this.create_time = builder.create_time;
            this.repost_num = builder.repost_num;
            this.topic = builder.topic;
            this.has_commented = builder.has_commented;
            this.from = builder.from;
            this.collect_status = builder.collect_status;
            this.collect_mark_pid = builder.collect_mark_pid;
            this.post_id = builder.post_id;
            this.time = builder.time;
            this.is_membertop = builder.is_membertop;
            this.anchor_info = builder.anchor_info;
            this.author_id = builder.author_id;
            this.valid_post_num = builder.valid_post_num;
            this.isLzDeleteAll = builder.isLzDeleteAll;
            this.is_ad = builder.is_ad;
            this.ecom = builder.ecom;
            this.pids = builder.pids;
            this.location = builder.location;
            this.guess = builder.guess;
            this.timeline = builder.timeline;
            this.act_info = Message.immutableCopyOf(builder.act_info);
            this.hot_weight = builder.hot_weight;
            this.livecover_src = builder.livecover_src;
            this.storecount = builder.storecount;
            this.post_num = builder.post_num;
            this.hotTWInfo = builder.hotTWInfo;
            this.twzhibo_info = builder.twzhibo_info;
            this.category_name = builder.category_name;
            this.poll_info = builder.poll_info;
            this.jid = builder.jid;
            this.is_novel = builder.is_novel;
            this.is_novel_thank = builder.is_novel_thank;
            this.is_novel_reward = builder.is_novel_reward;
            this.video_info = builder.video_info;
            this.push_end_time = builder.push_end_time;
            this.is_copythread = builder.is_copythread;
            this.operator_flag = builder.operator_flag;
            this.task_info = builder.task_info;
            this.pic_num = builder.pic_num;
            this.is_godthread_recommend = builder.is_godthread_recommend;
            this.yule_post_activity = builder.yule_post_activity;
            this.app_code = builder.app_code;
            this.ext_tails = Message.immutableCopyOf(builder.ext_tails);
            this.push_status = builder.push_status;
            this.cartoon_info = builder.cartoon_info;
            this.lego_card = builder.lego_card;
            this.high_together = builder.high_together;
            this.videoactive_info = builder.videoactive_info;
            this.is_deal = builder.is_deal;
            this.deal_info = builder.deal_info;
            this.animation_info = builder.animation_info;
            this.skin_info = builder.skin_info;
            this.ps_info = builder.ps_info;
            this.book_chapter = builder.book_chapter;
            this.is_book_chapter = builder.is_book_chapter;
            this.recom_source = builder.recom_source;
            this.recom_weight = builder.recom_weight;
            this.last_read_pid = builder.last_read_pid;
            this.cheak_repeat = builder.cheak_repeat;
            this.ab_tag = builder.ab_tag;
            this.recom_reason = builder.recom_reason;
            this.video_ad_info = builder.video_ad_info;
            this.rich_title = Message.immutableCopyOf(builder.rich_title);
            this.rich_abstract = Message.immutableCopyOf(builder.rich_abstract);
            this.ala_info = builder.ala_info;
            this.is_operate_thread = builder.is_operate_thread;
            this.is_tbread_dispatch = builder.is_tbread_dispatch;
            this.tbread_dispatch_info = builder.tbread_dispatch_info;
            this.app_info = builder.app_info;
            this.report_info = Message.immutableCopyOf(builder.report_info);
            this.video_channel_info = builder.video_channel_info;
            this.dislike_info = Message.immutableCopyOf(builder.dislike_info);
            this.declare_list = Message.immutableCopyOf(builder.declare_list);
            this.multiple_forum_list = Message.immutableCopyOf(builder.multiple_forum_list);
            this.is_multiforum_thread = builder.is_multiforum_thread;
            this.agree_num = builder.agree_num;
            this.top_agree_post = builder.top_agree_post;
            this.agree = builder.agree;
            this.is_partial_visible = builder.is_partial_visible;
            this.is_link_thread = builder.is_link_thread;
            this.link_info = builder.link_info;
            this.freq_num = builder.freq_num;
            this.is_god = builder.is_god;
            this.activity_info = builder.activity_info;
            this.pic_info = builder.pic_info;
            this.is_story_audit = builder.is_story_audit;
            this.share_num = builder.share_num;
            this.is_called = builder.is_called;
            this.tieba_game_information_source = builder.tieba_game_information_source;
            this.audit_time = builder.audit_time;
            this.middle_page_num = builder.middle_page_num;
            this.middle_page_pass_flag = builder.middle_page_pass_flag;
            this.origin_thread_info = builder.origin_thread_info;
            this.first_post_content = Message.immutableCopyOf(builder.first_post_content);
            this.is_share_thread = builder.is_share_thread;
            this.recom_extra = builder.recom_extra;
            this.trans_num = builder.trans_num;
            this.multi_forum_text = builder.multi_forum_text;
            this.star_rank_icon = builder.star_rank_icon;
            this.is_topic = builder.is_topic;
            this.topic_user_name = builder.topic_user_name;
            this.topic_h5_url = builder.topic_h5_url;
            this.presentation_style = builder.presentation_style;
            this.ori_forum_info = builder.ori_forum_info;
            this.is_videobiggie_recomthread = builder.is_videobiggie_recomthread;
            this.daily_paper_time = builder.daily_paper_time;
            this.forum_info = builder.forum_info;
            this.naws_info = builder.naws_info;
            this.video_segment = builder.video_segment;
            this.is_top_img = builder.is_top_img;
            this.t_share_img = builder.t_share_img;
            this.topic_module = builder.topic_module;
            this.is_bjh = builder.is_bjh;
            this.article_cover = builder.article_cover;
            this.bjh_content_tag = builder.bjh_content_tag;
            this.nid = builder.nid;
            this.is_headlinepost = builder.is_headlinepost;
            this.baijiahao = builder.baijiahao;
            this.is_s_card = builder.is_s_card;
            this.scard_packet_id = builder.scard_packet_id;
            this.thread_share_link = builder.thread_share_link;
            this.if_comment = builder.if_comment;
            this.if_comment_info = builder.if_comment_info;
            this.tab_id = builder.tab_id;
            this.tab_name = builder.tab_name;
            this.wonderful_post_info = builder.wonderful_post_info;
            this.pb_link_info = Message.immutableCopyOf(builder.pb_link_info);
            this.item = builder.item;
            this.item_star = Message.immutableCopyOf(builder.item_star);
            this.is_deleted = builder.is_deleted;
            this.hot_num = builder.hot_num;
            this.pb_goods_info = Message.immutableCopyOf(builder.pb_goods_info);
            this.is_local = builder.is_local;
            this.pb_entry = builder.pb_entry;
            this.is_author_view = builder.is_author_view;
            this.forum_user_live_msg = builder.forum_user_live_msg;
            this.forum_friend_watching_info = builder.forum_friend_watching_info;
            this.works_info = builder.works_info;
            this.collect_num = builder.collect_num;
            this.thread_recommend_infos = Message.immutableCopyOf(builder.thread_recommend_infos);
            this.recom_tag_icon = builder.recom_tag_icon;
            this.is_tiebaplus_ad = builder.is_tiebaplus_ad;
            this.tiebaplus_order_id = builder.tiebaplus_order_id;
            this.tiebaplus_token = builder.tiebaplus_token;
            this.tiebaplus_extra_param = builder.tiebaplus_extra_param;
            this.tiebaplus_cant_delete = builder.tiebaplus_cant_delete;
            this.is_frs_mask = builder.is_frs_mask;
            this.voice_room = builder.voice_room;
            this.tab_show_mode = builder.tab_show_mode;
            this.tiebaplus_ad = builder.tiebaplus_ad;
            this.recommend_tip = builder.recommend_tip;
            this.edit_info = builder.edit_info;
            this.is_pictxt = builder.is_pictxt;
            this.exposure_monitor_url = builder.exposure_monitor_url;
            this.click_monitor_url = builder.click_monitor_url;
            this.readonly = builder.readonly;
            this.thread_recommend_tag = builder.thread_recommend_tag;
            this.custom_figure = builder.custom_figure;
            this.custom_state = builder.custom_state;
            this.is_highlight = builder.is_highlight;
            this.is_xiuxiu_thread = builder.is_xiuxiu_thread;
            this.ablum_info = builder.ablum_info;
            this.show_ad_subscript = builder.show_ad_subscript;
            this.target_scheme = builder.target_scheme;
            this.convert_btn_type = builder.convert_btn_type;
            this.is_excellent_thread = builder.is_excellent_thread;
            this.literature_flag = builder.literature_flag;
            this.hot_post_list = Message.immutableCopyOf(builder.hot_post_list);
            this.robot_entrance = builder.robot_entrance;
            this.click_back_card = builder.click_back_card;
            this.peiwan_info = builder.peiwan_info;
            this.robot_thread_type = builder.robot_thread_type;
            this.book_id = builder.book_id;
            this.head_type = builder.head_type;
            this.disable_share = builder.disable_share;
            this.disable_share_toast = builder.disable_share_toast;
            this.share_url = builder.share_url;
            this.top_thread_set_time = builder.top_thread_set_time;
            this.business_mix = builder.business_mix;
            this.chat_private = builder.chat_private;
            this.log_param = Message.immutableCopyOf(builder.log_param);
            this.aichat_bot_card = builder.aichat_bot_card;
            this.icon_mark = Message.immutableCopyOf(builder.icon_mark);
            this.game_ext = builder.game_ext;
            this.placeholder_card_id = builder.placeholder_card_id;
            this.is_hottop_thread = builder.is_hottop_thread;
            this.disable_reply = builder.disable_reply;
            this.score_info = builder.score_info;
            this.show_post_content = builder.show_post_content;
            this.show_user_list = Message.immutableCopyOf(builder.show_user_list);
            this.show_ext_str = builder.show_ext_str;
            this.show_new_question_style = builder.show_new_question_style;
            this.title_ai = builder.title_ai;
            this.full_post_list = Message.immutableCopyOf(builder.full_post_list);
            this.thread_album_id = builder.thread_album_id;
            this.draw_info = builder.draw_info;
            this.hotest_post = builder.hotest_post;
            this.thread_album_status = builder.thread_album_status;
            this.question_bonus = builder.question_bonus;
            this.tiebaplus_da_type = builder.tiebaplus_da_type;
            this.tiebaplus_da_type_click = builder.tiebaplus_da_type_click;
            this.video_card = builder.video_card;
            this.poll_style = builder.poll_style;
            this.feed_nid = builder.feed_nid;
            this.video_other_info = builder.video_other_info;
            return;
        }
        Long l = builder.id;
        if (l == null) {
            this.id = DEFAULT_ID;
        } else {
            this.id = l;
        }
        Long l2 = builder.tid;
        if (l2 == null) {
            this.tid = DEFAULT_TID;
        } else {
            this.tid = l2;
        }
        String str = builder.title;
        if (str == null) {
            this.title = "";
        } else {
            this.title = str;
        }
        Integer num = builder.reply_num;
        if (num == null) {
            this.reply_num = DEFAULT_REPLY_NUM;
        } else {
            this.reply_num = num;
        }
        Integer num2 = builder.view_num;
        if (num2 == null) {
            this.view_num = DEFAULT_VIEW_NUM;
        } else {
            this.view_num = num2;
        }
        String str2 = builder.last_time;
        if (str2 == null) {
            this.last_time = "";
        } else {
            this.last_time = str2;
        }
        Integer num3 = builder.last_time_int;
        if (num3 == null) {
            this.last_time_int = DEFAULT_LAST_TIME_INT;
        } else {
            this.last_time_int = num3;
        }
        Integer num4 = builder.thread_types;
        if (num4 == null) {
            this.thread_types = DEFAULT_THREAD_TYPES;
        } else {
            this.thread_types = num4;
        }
        Integer num5 = builder.is_top;
        if (num5 == null) {
            this.is_top = DEFAULT_IS_TOP;
        } else {
            this.is_top = num5;
        }
        Integer num6 = builder.is_good;
        if (num6 == null) {
            this.is_good = DEFAULT_IS_GOOD;
        } else {
            this.is_good = num6;
        }
        Integer num7 = builder.is_vote;
        if (num7 == null) {
            this.is_vote = DEFAULT_IS_VOTE;
        } else {
            this.is_vote = num7;
        }
        Integer num8 = builder.is_bakan;
        if (num8 == null) {
            this.is_bakan = DEFAULT_IS_BAKAN;
        } else {
            this.is_bakan = num8;
        }
        Integer num9 = builder.is_protal;
        if (num9 == null) {
            this.is_protal = DEFAULT_IS_PROTAL;
        } else {
            this.is_protal = num9;
        }
        Integer num10 = builder.is_meizhi;
        if (num10 == null) {
            this.is_meizhi = DEFAULT_IS_MEIZHI;
        } else {
            this.is_meizhi = num10;
        }
        Integer num11 = builder.is_voice_thread;
        if (num11 == null) {
            this.is_voice_thread = DEFAULT_IS_VOICE_THREAD;
        } else {
            this.is_voice_thread = num11;
        }
        Integer num12 = builder.is_activity;
        if (num12 == null) {
            this.is_activity = DEFAULT_IS_ACTIVITY;
        } else {
            this.is_activity = num12;
        }
        Integer num13 = builder.is_notice;
        if (num13 == null) {
            this.is_notice = DEFAULT_IS_NOTICE;
        } else {
            this.is_notice = num13;
        }
        this.author = builder.author;
        this.last_replyer = builder.last_replyer;
        Integer num14 = builder.comment_num;
        if (num14 == null) {
            this.comment_num = DEFAULT_COMMENT_NUM;
        } else {
            this.comment_num = num14;
        }
        List<Abstract> list = builder._abstract;
        if (list == null) {
            this._abstract = DEFAULT_ABSTRACT;
        } else {
            this._abstract = Message.immutableCopyOf(list);
        }
        List<Media> list2 = builder.media;
        if (list2 == null) {
            this.media = DEFAULT_MEDIA;
        } else {
            this.media = Message.immutableCopyOf(list2);
        }
        List<Voice> list3 = builder.voice_info;
        if (list3 == null) {
            this.voice_info = DEFAULT_VOICE_INFO;
        } else {
            this.voice_info = Message.immutableCopyOf(list3);
        }
        String str3 = builder.meizhi_pic;
        if (str3 == null) {
            this.meizhi_pic = "";
        } else {
            this.meizhi_pic = str3;
        }
        List<MediaNum> list4 = builder.media_num;
        if (list4 == null) {
            this.media_num = DEFAULT_MEDIA_NUM;
        } else {
            this.media_num = Message.immutableCopyOf(list4);
        }
        Integer num15 = builder.thread_type;
        if (num15 == null) {
            this.thread_type = DEFAULT_THREAD_TYPE;
        } else {
            this.thread_type = num15;
        }
        Long l3 = builder.fid;
        if (l3 == null) {
            this.fid = DEFAULT_FID;
        } else {
            this.fid = l3;
        }
        String str4 = builder.fname;
        if (str4 == null) {
            this.fname = "";
        } else {
            this.fname = str4;
        }
        String str5 = builder.live_post_type;
        if (str5 == null) {
            this.live_post_type = "";
        } else {
            this.live_post_type = str5;
        }
        Integer num16 = builder.is_livepost;
        if (num16 == null) {
            this.is_livepost = DEFAULT_IS_LIVEPOST;
        } else {
            this.is_livepost = num16;
        }
        Integer num17 = builder.show_commented;
        if (num17 == null) {
            this.show_commented = DEFAULT_SHOW_COMMENTED;
        } else {
            this.show_commented = num17;
        }
        String str6 = builder.click_url;
        if (str6 == null) {
            this.click_url = "";
        } else {
            this.click_url = str6;
        }
        String str7 = builder.video;
        if (str7 == null) {
            this.video = "";
        } else {
            this.video = str7;
        }
        String str8 = builder.video_swf;
        if (str8 == null) {
            this.video_swf = "";
        } else {
            this.video_swf = str8;
        }
        String str9 = builder.video_cover;
        if (str9 == null) {
            this.video_cover = "";
        } else {
            this.video_cover = str9;
        }
        String str10 = builder.video_id;
        if (str10 == null) {
            this.video_id = "";
        } else {
            this.video_id = str10;
        }
        String str11 = builder.video_mobile_url;
        if (str11 == null) {
            this.video_mobile_url = "";
        } else {
            this.video_mobile_url = str11;
        }
        Integer num18 = builder.is_ntitle;
        if (num18 == null) {
            this.is_ntitle = DEFAULT_IS_NTITLE;
        } else {
            this.is_ntitle = num18;
        }
        Integer num19 = builder.is_bub;
        if (num19 == null) {
            this.is_bub = DEFAULT_IS_BUB;
        } else {
            this.is_bub = num19;
        }
        Long l4 = builder.first_post_id;
        if (l4 == null) {
            this.first_post_id = DEFAULT_FIRST_POST_ID;
        } else {
            this.first_post_id = l4;
        }
        this.zan = builder.zan;
        Integer num20 = builder.is_global_top;
        if (num20 == null) {
            this.is_global_top = DEFAULT_IS_GLOBAL_TOP;
        } else {
            this.is_global_top = num20;
        }
        Integer num21 = builder.is_pic;
        if (num21 == null) {
            this.is_pic = DEFAULT_IS_PIC;
        } else {
            this.is_pic = num21;
        }
        List<PostList> list5 = builder.post_list;
        if (list5 == null) {
            this.post_list = DEFAULT_POST_LIST;
        } else {
            this.post_list = Message.immutableCopyOf(list5);
        }
        Integer num22 = builder.create_time;
        if (num22 == null) {
            this.create_time = DEFAULT_CREATE_TIME;
        } else {
            this.create_time = num22;
        }
        Integer num23 = builder.repost_num;
        if (num23 == null) {
            this.repost_num = DEFAULT_REPOST_NUM;
        } else {
            this.repost_num = num23;
        }
        this.topic = builder.topic;
        Integer num24 = builder.has_commented;
        if (num24 == null) {
            this.has_commented = DEFAULT_HAS_COMMENTED;
        } else {
            this.has_commented = num24;
        }
        String str12 = builder.from;
        if (str12 == null) {
            this.from = "";
        } else {
            this.from = str12;
        }
        Integer num25 = builder.collect_status;
        if (num25 == null) {
            this.collect_status = DEFAULT_COLLECT_STATUS;
        } else {
            this.collect_status = num25;
        }
        String str13 = builder.collect_mark_pid;
        if (str13 == null) {
            this.collect_mark_pid = "";
        } else {
            this.collect_mark_pid = str13;
        }
        Long l5 = builder.post_id;
        if (l5 == null) {
            this.post_id = DEFAULT_POST_ID;
        } else {
            this.post_id = l5;
        }
        Integer num26 = builder.time;
        if (num26 == null) {
            this.time = DEFAULT_TIME;
        } else {
            this.time = num26;
        }
        Integer num27 = builder.is_membertop;
        if (num27 == null) {
            this.is_membertop = DEFAULT_IS_MEMBERTOP;
        } else {
            this.is_membertop = num27;
        }
        this.anchor_info = builder.anchor_info;
        Long l6 = builder.author_id;
        if (l6 == null) {
            this.author_id = DEFAULT_AUTHOR_ID;
        } else {
            this.author_id = l6;
        }
        Integer num28 = builder.valid_post_num;
        if (num28 == null) {
            this.valid_post_num = DEFAULT_VALID_POST_NUM;
        } else {
            this.valid_post_num = num28;
        }
        Integer num29 = builder.isLzDeleteAll;
        if (num29 == null) {
            this.isLzDeleteAll = DEFAULT_ISLZDELETEALL;
        } else {
            this.isLzDeleteAll = num29;
        }
        Integer num30 = builder.is_ad;
        if (num30 == null) {
            this.is_ad = DEFAULT_IS_AD;
        } else {
            this.is_ad = num30;
        }
        String str14 = builder.ecom;
        if (str14 == null) {
            this.ecom = "";
        } else {
            this.ecom = str14;
        }
        String str15 = builder.pids;
        if (str15 == null) {
            this.pids = "";
        } else {
            this.pids = str15;
        }
        this.location = builder.location;
        this.guess = builder.guess;
        Integer num31 = builder.timeline;
        if (num31 == null) {
            this.timeline = DEFAULT_TIMELINE;
        } else {
            this.timeline = num31;
        }
        List<ActInfo> list6 = builder.act_info;
        if (list6 == null) {
            this.act_info = DEFAULT_ACT_INFO;
        } else {
            this.act_info = Message.immutableCopyOf(list6);
        }
        Integer num32 = builder.hot_weight;
        if (num32 == null) {
            this.hot_weight = DEFAULT_HOT_WEIGHT;
        } else {
            this.hot_weight = num32;
        }
        String str16 = builder.livecover_src;
        if (str16 == null) {
            this.livecover_src = "";
        } else {
            this.livecover_src = str16;
        }
        Integer num33 = builder.storecount;
        if (num33 == null) {
            this.storecount = DEFAULT_STORECOUNT;
        } else {
            this.storecount = num33;
        }
        Integer num34 = builder.post_num;
        if (num34 == null) {
            this.post_num = DEFAULT_POST_NUM;
        } else {
            this.post_num = num34;
        }
        this.hotTWInfo = builder.hotTWInfo;
        this.twzhibo_info = builder.twzhibo_info;
        String str17 = builder.category_name;
        if (str17 == null) {
            this.category_name = "";
        } else {
            this.category_name = str17;
        }
        this.poll_info = builder.poll_info;
        this.jid = builder.jid;
        Integer num35 = builder.is_novel;
        if (num35 == null) {
            this.is_novel = DEFAULT_IS_NOVEL;
        } else {
            this.is_novel = num35;
        }
        Integer num36 = builder.is_novel_thank;
        if (num36 == null) {
            this.is_novel_thank = DEFAULT_IS_NOVEL_THANK;
        } else {
            this.is_novel_thank = num36;
        }
        Integer num37 = builder.is_novel_reward;
        if (num37 == null) {
            this.is_novel_reward = DEFAULT_IS_NOVEL_REWARD;
        } else {
            this.is_novel_reward = num37;
        }
        this.video_info = builder.video_info;
        Integer num38 = builder.push_end_time;
        if (num38 == null) {
            this.push_end_time = DEFAULT_PUSH_END_TIME;
        } else {
            this.push_end_time = num38;
        }
        Integer num39 = builder.is_copythread;
        if (num39 == null) {
            this.is_copythread = DEFAULT_IS_COPYTHREAD;
        } else {
            this.is_copythread = num39;
        }
        Integer num40 = builder.operator_flag;
        if (num40 == null) {
            this.operator_flag = DEFAULT_OPERATOR_FLAG;
        } else {
            this.operator_flag = num40;
        }
        this.task_info = builder.task_info;
        Integer num41 = builder.pic_num;
        if (num41 == null) {
            this.pic_num = DEFAULT_PIC_NUM;
        } else {
            this.pic_num = num41;
        }
        Integer num42 = builder.is_godthread_recommend;
        if (num42 == null) {
            this.is_godthread_recommend = DEFAULT_IS_GODTHREAD_RECOMMEND;
        } else {
            this.is_godthread_recommend = num42;
        }
        this.yule_post_activity = builder.yule_post_activity;
        this.app_code = builder.app_code;
        List<TailInfo> list7 = builder.ext_tails;
        if (list7 == null) {
            this.ext_tails = DEFAULT_EXT_TAILS;
        } else {
            this.ext_tails = Message.immutableCopyOf(list7);
        }
        this.push_status = builder.push_status;
        this.cartoon_info = builder.cartoon_info;
        String str18 = builder.lego_card;
        if (str18 == null) {
            this.lego_card = "";
        } else {
            this.lego_card = str18;
        }
        this.high_together = builder.high_together;
        this.videoactive_info = builder.videoactive_info;
        Integer num43 = builder.is_deal;
        if (num43 == null) {
            this.is_deal = DEFAULT_IS_DEAL;
        } else {
            this.is_deal = num43;
        }
        this.deal_info = builder.deal_info;
        this.animation_info = builder.animation_info;
        this.skin_info = builder.skin_info;
        this.ps_info = builder.ps_info;
        this.book_chapter = builder.book_chapter;
        Integer num44 = builder.is_book_chapter;
        if (num44 == null) {
            this.is_book_chapter = DEFAULT_IS_BOOK_CHAPTER;
        } else {
            this.is_book_chapter = num44;
        }
        String str19 = builder.recom_source;
        if (str19 == null) {
            this.recom_source = "";
        } else {
            this.recom_source = str19;
        }
        String str20 = builder.recom_weight;
        if (str20 == null) {
            this.recom_weight = "";
        } else {
            this.recom_weight = str20;
        }
        Long l7 = builder.last_read_pid;
        if (l7 == null) {
            this.last_read_pid = DEFAULT_LAST_READ_PID;
        } else {
            this.last_read_pid = l7;
        }
        Integer num45 = builder.cheak_repeat;
        if (num45 == null) {
            this.cheak_repeat = DEFAULT_CHEAK_REPEAT;
        } else {
            this.cheak_repeat = num45;
        }
        String str21 = builder.ab_tag;
        if (str21 == null) {
            this.ab_tag = "";
        } else {
            this.ab_tag = str21;
        }
        String str22 = builder.recom_reason;
        if (str22 == null) {
            this.recom_reason = "";
        } else {
            this.recom_reason = str22;
        }
        this.video_ad_info = builder.video_ad_info;
        List<PbContent> list8 = builder.rich_title;
        if (list8 == null) {
            this.rich_title = DEFAULT_RICH_TITLE;
        } else {
            this.rich_title = Message.immutableCopyOf(list8);
        }
        List<PbContent> list9 = builder.rich_abstract;
        if (list9 == null) {
            this.rich_abstract = DEFAULT_RICH_ABSTRACT;
        } else {
            this.rich_abstract = Message.immutableCopyOf(list9);
        }
        this.ala_info = builder.ala_info;
        Integer num46 = builder.is_operate_thread;
        if (num46 == null) {
            this.is_operate_thread = DEFAULT_IS_OPERATE_THREAD;
        } else {
            this.is_operate_thread = num46;
        }
        Integer num47 = builder.is_tbread_dispatch;
        if (num47 == null) {
            this.is_tbread_dispatch = DEFAULT_IS_TBREAD_DISPATCH;
        } else {
            this.is_tbread_dispatch = num47;
        }
        this.tbread_dispatch_info = builder.tbread_dispatch_info;
        this.app_info = builder.app_info;
        List<ReportInfo> list10 = builder.report_info;
        if (list10 == null) {
            this.report_info = DEFAULT_REPORT_INFO;
        } else {
            this.report_info = Message.immutableCopyOf(list10);
        }
        this.video_channel_info = builder.video_channel_info;
        List<DislikeInfo> list11 = builder.dislike_info;
        if (list11 == null) {
            this.dislike_info = DEFAULT_DISLIKE_INFO;
        } else {
            this.dislike_info = Message.immutableCopyOf(list11);
        }
        List<DeclareInfo> list12 = builder.declare_list;
        if (list12 == null) {
            this.declare_list = DEFAULT_DECLARE_LIST;
        } else {
            this.declare_list = Message.immutableCopyOf(list12);
        }
        List<MultipleForum> list13 = builder.multiple_forum_list;
        if (list13 == null) {
            this.multiple_forum_list = DEFAULT_MULTIPLE_FORUM_LIST;
        } else {
            this.multiple_forum_list = Message.immutableCopyOf(list13);
        }
        Integer num48 = builder.is_multiforum_thread;
        if (num48 == null) {
            this.is_multiforum_thread = DEFAULT_IS_MULTIFORUM_THREAD;
        } else {
            this.is_multiforum_thread = num48;
        }
        Integer num49 = builder.agree_num;
        if (num49 == null) {
            this.agree_num = DEFAULT_AGREE_NUM;
        } else {
            this.agree_num = num49;
        }
        this.top_agree_post = builder.top_agree_post;
        this.agree = builder.agree;
        Integer num50 = builder.is_partial_visible;
        if (num50 == null) {
            this.is_partial_visible = DEFAULT_IS_PARTIAL_VISIBLE;
        } else {
            this.is_partial_visible = num50;
        }
        Integer num51 = builder.is_link_thread;
        if (num51 == null) {
            this.is_link_thread = DEFAULT_IS_LINK_THREAD;
        } else {
            this.is_link_thread = num51;
        }
        this.link_info = builder.link_info;
        Long l8 = builder.freq_num;
        if (l8 == null) {
            this.freq_num = DEFAULT_FREQ_NUM;
        } else {
            this.freq_num = l8;
        }
        Integer num52 = builder.is_god;
        if (num52 == null) {
            this.is_god = DEFAULT_IS_GOD;
        } else {
            this.is_god = num52;
        }
        this.activity_info = builder.activity_info;
        this.pic_info = builder.pic_info;
        Integer num53 = builder.is_story_audit;
        if (num53 == null) {
            this.is_story_audit = DEFAULT_IS_STORY_AUDIT;
        } else {
            this.is_story_audit = num53;
        }
        Long l9 = builder.share_num;
        if (l9 == null) {
            this.share_num = DEFAULT_SHARE_NUM;
        } else {
            this.share_num = l9;
        }
        Integer num54 = builder.is_called;
        if (num54 == null) {
            this.is_called = DEFAULT_IS_CALLED;
        } else {
            this.is_called = num54;
        }
        String str23 = builder.tieba_game_information_source;
        if (str23 == null) {
            this.tieba_game_information_source = "";
        } else {
            this.tieba_game_information_source = str23;
        }
        Long l10 = builder.audit_time;
        if (l10 == null) {
            this.audit_time = DEFAULT_AUDIT_TIME;
        } else {
            this.audit_time = l10;
        }
        Integer num55 = builder.middle_page_num;
        if (num55 == null) {
            this.middle_page_num = DEFAULT_MIDDLE_PAGE_NUM;
        } else {
            this.middle_page_num = num55;
        }
        Integer num56 = builder.middle_page_pass_flag;
        if (num56 == null) {
            this.middle_page_pass_flag = DEFAULT_MIDDLE_PAGE_PASS_FLAG;
        } else {
            this.middle_page_pass_flag = num56;
        }
        this.origin_thread_info = builder.origin_thread_info;
        List<PbContent> list14 = builder.first_post_content;
        if (list14 == null) {
            this.first_post_content = DEFAULT_FIRST_POST_CONTENT;
        } else {
            this.first_post_content = Message.immutableCopyOf(list14);
        }
        Integer num57 = builder.is_share_thread;
        if (num57 == null) {
            this.is_share_thread = DEFAULT_IS_SHARE_THREAD;
        } else {
            this.is_share_thread = num57;
        }
        String str24 = builder.recom_extra;
        if (str24 == null) {
            this.recom_extra = "";
        } else {
            this.recom_extra = str24;
        }
        Long l11 = builder.trans_num;
        if (l11 == null) {
            this.trans_num = DEFAULT_TRANS_NUM;
        } else {
            this.trans_num = l11;
        }
        String str25 = builder.multi_forum_text;
        if (str25 == null) {
            this.multi_forum_text = "";
        } else {
            this.multi_forum_text = str25;
        }
        this.star_rank_icon = builder.star_rank_icon;
        Integer num58 = builder.is_topic;
        if (num58 == null) {
            this.is_topic = DEFAULT_IS_TOPIC;
        } else {
            this.is_topic = num58;
        }
        String str26 = builder.topic_user_name;
        if (str26 == null) {
            this.topic_user_name = "";
        } else {
            this.topic_user_name = str26;
        }
        String str27 = builder.topic_h5_url;
        if (str27 == null) {
            this.topic_h5_url = "";
        } else {
            this.topic_h5_url = str27;
        }
        String str28 = builder.presentation_style;
        if (str28 == null) {
            this.presentation_style = "";
        } else {
            this.presentation_style = str28;
        }
        this.ori_forum_info = builder.ori_forum_info;
        Integer num59 = builder.is_videobiggie_recomthread;
        if (num59 == null) {
            this.is_videobiggie_recomthread = DEFAULT_IS_VIDEOBIGGIE_RECOMTHREAD;
        } else {
            this.is_videobiggie_recomthread = num59;
        }
        String str29 = builder.daily_paper_time;
        if (str29 == null) {
            this.daily_paper_time = "";
        } else {
            this.daily_paper_time = str29;
        }
        this.forum_info = builder.forum_info;
        this.naws_info = builder.naws_info;
        this.video_segment = builder.video_segment;
        String str30 = builder.is_top_img;
        if (str30 == null) {
            this.is_top_img = "";
        } else {
            this.is_top_img = str30;
        }
        String str31 = builder.t_share_img;
        if (str31 == null) {
            this.t_share_img = "";
        } else {
            this.t_share_img = str31;
        }
        this.topic_module = builder.topic_module;
        Integer num60 = builder.is_bjh;
        if (num60 == null) {
            this.is_bjh = DEFAULT_IS_BJH;
        } else {
            this.is_bjh = num60;
        }
        String str32 = builder.article_cover;
        if (str32 == null) {
            this.article_cover = "";
        } else {
            this.article_cover = str32;
        }
        Integer num61 = builder.bjh_content_tag;
        if (num61 == null) {
            this.bjh_content_tag = DEFAULT_BJH_CONTENT_TAG;
        } else {
            this.bjh_content_tag = num61;
        }
        String str33 = builder.nid;
        if (str33 == null) {
            this.nid = "";
        } else {
            this.nid = str33;
        }
        Integer num62 = builder.is_headlinepost;
        if (num62 == null) {
            this.is_headlinepost = DEFAULT_IS_HEADLINEPOST;
        } else {
            this.is_headlinepost = num62;
        }
        this.baijiahao = builder.baijiahao;
        Integer num63 = builder.is_s_card;
        if (num63 == null) {
            this.is_s_card = DEFAULT_IS_S_CARD;
        } else {
            this.is_s_card = num63;
        }
        String str34 = builder.scard_packet_id;
        if (str34 == null) {
            this.scard_packet_id = "";
        } else {
            this.scard_packet_id = str34;
        }
        String str35 = builder.thread_share_link;
        if (str35 == null) {
            this.thread_share_link = "";
        } else {
            this.thread_share_link = str35;
        }
        Integer num64 = builder.if_comment;
        if (num64 == null) {
            this.if_comment = DEFAULT_IF_COMMENT;
        } else {
            this.if_comment = num64;
        }
        String str36 = builder.if_comment_info;
        if (str36 == null) {
            this.if_comment_info = "";
        } else {
            this.if_comment_info = str36;
        }
        Integer num65 = builder.tab_id;
        if (num65 == null) {
            this.tab_id = DEFAULT_TAB_ID;
        } else {
            this.tab_id = num65;
        }
        String str37 = builder.tab_name;
        if (str37 == null) {
            this.tab_name = "";
        } else {
            this.tab_name = str37;
        }
        String str38 = builder.wonderful_post_info;
        if (str38 == null) {
            this.wonderful_post_info = "";
        } else {
            this.wonderful_post_info = str38;
        }
        List<PbLinkInfo> list15 = builder.pb_link_info;
        if (list15 == null) {
            this.pb_link_info = DEFAULT_PB_LINK_INFO;
        } else {
            this.pb_link_info = Message.immutableCopyOf(list15);
        }
        this.item = builder.item;
        List<HeadItem> list16 = builder.item_star;
        if (list16 == null) {
            this.item_star = DEFAULT_ITEM_STAR;
        } else {
            this.item_star = Message.immutableCopyOf(list16);
        }
        Integer num66 = builder.is_deleted;
        if (num66 == null) {
            this.is_deleted = DEFAULT_IS_DELETED;
        } else {
            this.is_deleted = num66;
        }
        Integer num67 = builder.hot_num;
        if (num67 == null) {
            this.hot_num = DEFAULT_HOT_NUM;
        } else {
            this.hot_num = num67;
        }
        List<PbGoodsInfo> list17 = builder.pb_goods_info;
        if (list17 == null) {
            this.pb_goods_info = DEFAULT_PB_GOODS_INFO;
        } else {
            this.pb_goods_info = Message.immutableCopyOf(list17);
        }
        Integer num68 = builder.is_local;
        if (num68 == null) {
            this.is_local = DEFAULT_IS_LOCAL;
        } else {
            this.is_local = num68;
        }
        Integer num69 = builder.pb_entry;
        if (num69 == null) {
            this.pb_entry = DEFAULT_PB_ENTRY;
        } else {
            this.pb_entry = num69;
        }
        Integer num70 = builder.is_author_view;
        if (num70 == null) {
            this.is_author_view = DEFAULT_IS_AUTHOR_VIEW;
        } else {
            this.is_author_view = num70;
        }
        String str39 = builder.forum_user_live_msg;
        if (str39 == null) {
            this.forum_user_live_msg = "";
        } else {
            this.forum_user_live_msg = str39;
        }
        this.forum_friend_watching_info = builder.forum_friend_watching_info;
        this.works_info = builder.works_info;
        Integer num71 = builder.collect_num;
        if (num71 == null) {
            this.collect_num = DEFAULT_COLLECT_NUM;
        } else {
            this.collect_num = num71;
        }
        List<ThreadRecommendInfo> list18 = builder.thread_recommend_infos;
        if (list18 == null) {
            this.thread_recommend_infos = DEFAULT_THREAD_RECOMMEND_INFOS;
        } else {
            this.thread_recommend_infos = Message.immutableCopyOf(list18);
        }
        String str40 = builder.recom_tag_icon;
        if (str40 == null) {
            this.recom_tag_icon = "";
        } else {
            this.recom_tag_icon = str40;
        }
        String str41 = builder.is_tiebaplus_ad;
        if (str41 == null) {
            this.is_tiebaplus_ad = "";
        } else {
            this.is_tiebaplus_ad = str41;
        }
        String str42 = builder.tiebaplus_order_id;
        if (str42 == null) {
            this.tiebaplus_order_id = "";
        } else {
            this.tiebaplus_order_id = str42;
        }
        String str43 = builder.tiebaplus_token;
        if (str43 == null) {
            this.tiebaplus_token = "";
        } else {
            this.tiebaplus_token = str43;
        }
        String str44 = builder.tiebaplus_extra_param;
        if (str44 == null) {
            this.tiebaplus_extra_param = "";
        } else {
            this.tiebaplus_extra_param = str44;
        }
        Integer num72 = builder.tiebaplus_cant_delete;
        if (num72 == null) {
            this.tiebaplus_cant_delete = DEFAULT_TIEBAPLUS_CANT_DELETE;
        } else {
            this.tiebaplus_cant_delete = num72;
        }
        Integer num73 = builder.is_frs_mask;
        if (num73 == null) {
            this.is_frs_mask = DEFAULT_IS_FRS_MASK;
        } else {
            this.is_frs_mask = num73;
        }
        this.voice_room = builder.voice_room;
        Integer num74 = builder.tab_show_mode;
        if (num74 == null) {
            this.tab_show_mode = DEFAULT_TAB_SHOW_MODE;
        } else {
            this.tab_show_mode = num74;
        }
        this.tiebaplus_ad = builder.tiebaplus_ad;
        this.recommend_tip = builder.recommend_tip;
        this.edit_info = builder.edit_info;
        Integer num75 = builder.is_pictxt;
        if (num75 == null) {
            this.is_pictxt = DEFAULT_IS_PICTXT;
        } else {
            this.is_pictxt = num75;
        }
        String str45 = builder.exposure_monitor_url;
        if (str45 == null) {
            this.exposure_monitor_url = "";
        } else {
            this.exposure_monitor_url = str45;
        }
        String str46 = builder.click_monitor_url;
        if (str46 == null) {
            this.click_monitor_url = "";
        } else {
            this.click_monitor_url = str46;
        }
        Integer num76 = builder.readonly;
        if (num76 == null) {
            this.readonly = DEFAULT_READONLY;
        } else {
            this.readonly = num76;
        }
        this.thread_recommend_tag = builder.thread_recommend_tag;
        this.custom_figure = builder.custom_figure;
        this.custom_state = builder.custom_state;
        Integer num77 = builder.is_highlight;
        if (num77 == null) {
            this.is_highlight = DEFAULT_IS_HIGHLIGHT;
        } else {
            this.is_highlight = num77;
        }
        Integer num78 = builder.is_xiuxiu_thread;
        if (num78 == null) {
            this.is_xiuxiu_thread = DEFAULT_IS_XIUXIU_THREAD;
        } else {
            this.is_xiuxiu_thread = num78;
        }
        this.ablum_info = builder.ablum_info;
        Integer num79 = builder.show_ad_subscript;
        if (num79 == null) {
            this.show_ad_subscript = DEFAULT_SHOW_AD_SUBSCRIPT;
        } else {
            this.show_ad_subscript = num79;
        }
        String str47 = builder.target_scheme;
        if (str47 == null) {
            this.target_scheme = "";
        } else {
            this.target_scheme = str47;
        }
        String str48 = builder.convert_btn_type;
        if (str48 == null) {
            this.convert_btn_type = "";
        } else {
            this.convert_btn_type = str48;
        }
        Integer num80 = builder.is_excellent_thread;
        if (num80 == null) {
            this.is_excellent_thread = DEFAULT_IS_EXCELLENT_THREAD;
        } else {
            this.is_excellent_thread = num80;
        }
        Integer num81 = builder.literature_flag;
        if (num81 == null) {
            this.literature_flag = DEFAULT_LITERATURE_FLAG;
        } else {
            this.literature_flag = num81;
        }
        List<Post> list19 = builder.hot_post_list;
        if (list19 == null) {
            this.hot_post_list = DEFAULT_HOT_POST_LIST;
        } else {
            this.hot_post_list = Message.immutableCopyOf(list19);
        }
        this.robot_entrance = builder.robot_entrance;
        this.click_back_card = builder.click_back_card;
        this.peiwan_info = builder.peiwan_info;
        Long l12 = builder.robot_thread_type;
        if (l12 == null) {
            this.robot_thread_type = DEFAULT_ROBOT_THREAD_TYPE;
        } else {
            this.robot_thread_type = l12;
        }
        Long l13 = builder.book_id;
        if (l13 == null) {
            this.book_id = DEFAULT_BOOK_ID;
        } else {
            this.book_id = l13;
        }
        String str49 = builder.head_type;
        if (str49 == null) {
            this.head_type = "";
        } else {
            this.head_type = str49;
        }
        Long l14 = builder.disable_share;
        if (l14 == null) {
            this.disable_share = DEFAULT_DISABLE_SHARE;
        } else {
            this.disable_share = l14;
        }
        String str50 = builder.disable_share_toast;
        if (str50 == null) {
            this.disable_share_toast = "";
        } else {
            this.disable_share_toast = str50;
        }
        String str51 = builder.share_url;
        if (str51 == null) {
            this.share_url = "";
        } else {
            this.share_url = str51;
        }
        Long l15 = builder.top_thread_set_time;
        if (l15 == null) {
            this.top_thread_set_time = DEFAULT_TOP_THREAD_SET_TIME;
        } else {
            this.top_thread_set_time = l15;
        }
        this.business_mix = builder.business_mix;
        this.chat_private = builder.chat_private;
        List<FeedKV> list20 = builder.log_param;
        if (list20 == null) {
            this.log_param = DEFAULT_LOG_PARAM;
        } else {
            this.log_param = Message.immutableCopyOf(list20);
        }
        this.aichat_bot_card = builder.aichat_bot_card;
        List<IconMark> list21 = builder.icon_mark;
        if (list21 == null) {
            this.icon_mark = DEFAULT_ICON_MARK;
        } else {
            this.icon_mark = Message.immutableCopyOf(list21);
        }
        String str52 = builder.game_ext;
        if (str52 == null) {
            this.game_ext = "";
        } else {
            this.game_ext = str52;
        }
        String str53 = builder.placeholder_card_id;
        if (str53 == null) {
            this.placeholder_card_id = "";
        } else {
            this.placeholder_card_id = str53;
        }
        Boolean bool = builder.is_hottop_thread;
        if (bool == null) {
            this.is_hottop_thread = DEFAULT_IS_HOTTOP_THREAD;
        } else {
            this.is_hottop_thread = bool;
        }
        Long l16 = builder.disable_reply;
        if (l16 == null) {
            this.disable_reply = DEFAULT_DISABLE_REPLY;
        } else {
            this.disable_reply = l16;
        }
        this.score_info = builder.score_info;
        this.show_post_content = builder.show_post_content;
        List<User> list22 = builder.show_user_list;
        if (list22 == null) {
            this.show_user_list = DEFAULT_SHOW_USER_LIST;
        } else {
            this.show_user_list = Message.immutableCopyOf(list22);
        }
        String str54 = builder.show_ext_str;
        if (str54 == null) {
            this.show_ext_str = "";
        } else {
            this.show_ext_str = str54;
        }
        Integer num82 = builder.show_new_question_style;
        if (num82 == null) {
            this.show_new_question_style = DEFAULT_SHOW_NEW_QUESTION_STYLE;
        } else {
            this.show_new_question_style = num82;
        }
        String str55 = builder.title_ai;
        if (str55 == null) {
            this.title_ai = "";
        } else {
            this.title_ai = str55;
        }
        List<Post> list23 = builder.full_post_list;
        if (list23 == null) {
            this.full_post_list = DEFAULT_FULL_POST_LIST;
        } else {
            this.full_post_list = Message.immutableCopyOf(list23);
        }
        Integer num83 = builder.thread_album_id;
        if (num83 == null) {
            this.thread_album_id = DEFAULT_THREAD_ALBUM_ID;
        } else {
            this.thread_album_id = num83;
        }
        this.draw_info = builder.draw_info;
        this.hotest_post = builder.hotest_post;
        Integer num84 = builder.thread_album_status;
        if (num84 == null) {
            this.thread_album_status = DEFAULT_THREAD_ALBUM_STATUS;
        } else {
            this.thread_album_status = num84;
        }
        this.question_bonus = builder.question_bonus;
        Integer num85 = builder.tiebaplus_da_type;
        if (num85 == null) {
            this.tiebaplus_da_type = DEFAULT_TIEBAPLUS_DA_TYPE;
        } else {
            this.tiebaplus_da_type = num85;
        }
        Integer num86 = builder.tiebaplus_da_type_click;
        if (num86 == null) {
            this.tiebaplus_da_type_click = DEFAULT_TIEBAPLUS_DA_TYPE_CLICK;
        } else {
            this.tiebaplus_da_type_click = num86;
        }
        this.video_card = builder.video_card;
        Integer num87 = builder.poll_style;
        if (num87 == null) {
            this.poll_style = DEFAULT_POLL_STYLE;
        } else {
            this.poll_style = num87;
        }
        String str56 = builder.feed_nid;
        if (str56 == null) {
            this.feed_nid = "";
        } else {
            this.feed_nid = str56;
        }
        this.video_other_info = builder.video_other_info;
    }

    public static final class Builder extends Message.Builder<ThreadInfo> {
        public List<Abstract> _abstract;
        public String ab_tag;
        public ThreadAblum ablum_info;
        public List<ActInfo> act_info;
        public ActivityInfo activity_info;
        public Agree agree;
        public Integer agree_num;
        public AichatBotCard aichat_bot_card;
        public AlaLiveInfo ala_info;
        public AnchorInfo anchor_info;
        public AnimationThread animation_info;
        public AppCode app_code;
        public AppInfo app_info;
        public String article_cover;
        public Long audit_time;
        public User author;
        public Long author_id;
        public Baijiahao baijiahao;
        public Integer bjh_content_tag;
        public BookThread book_chapter;
        public Long book_id;
        public BusinessMix business_mix;
        public CartoonThread cartoon_info;
        public String category_name;
        public ChatPrivate chat_private;
        public Integer cheak_repeat;
        public ClickBackCard click_back_card;
        public String click_monitor_url;
        public String click_url;
        public String collect_mark_pid;
        public Integer collect_num;
        public Integer collect_status;
        public Integer comment_num;
        public String convert_btn_type;
        public Integer create_time;
        public CustomFigure custom_figure;
        public CustomState custom_state;
        public String daily_paper_time;
        public DealInfo deal_info;
        public List<DeclareInfo> declare_list;
        public Long disable_reply;
        public Long disable_share;
        public String disable_share_toast;
        public List<DislikeInfo> dislike_info;
        public ThreadDrawInfo draw_info;
        public String ecom;
        public EditInfo edit_info;
        public String exposure_monitor_url;
        public List<TailInfo> ext_tails;
        public String feed_nid;
        public Long fid;
        public List<PbContent> first_post_content;
        public Long first_post_id;
        public String fname;
        public ForumFriendWatchingInfo forum_friend_watching_info;
        public SimpleForum forum_info;
        public String forum_user_live_msg;
        public Long freq_num;
        public String from;
        public List<Post> full_post_list;
        public String game_ext;
        public Guess guess;
        public Integer has_commented;
        public String head_type;
        public TogetherHi high_together;
        public HotTWThreadInfo hotTWInfo;
        public Integer hot_num;
        public List<Post> hot_post_list;
        public Integer hot_weight;
        public Post hotest_post;
        public List<IconMark> icon_mark;
        public Long id;
        public Integer if_comment;
        public String if_comment_info;
        public Integer isLzDeleteAll;
        public Integer is_activity;
        public Integer is_ad;
        public Integer is_author_view;
        public Integer is_bakan;
        public Integer is_bjh;
        public Integer is_book_chapter;
        public Integer is_bub;
        public Integer is_called;
        public Integer is_copythread;
        public Integer is_deal;
        public Integer is_deleted;
        public Integer is_excellent_thread;
        public Integer is_frs_mask;
        public Integer is_global_top;
        public Integer is_god;
        public Integer is_godthread_recommend;
        public Integer is_good;
        public Integer is_headlinepost;
        public Integer is_highlight;
        public Boolean is_hottop_thread;
        public Integer is_link_thread;
        public Integer is_livepost;
        public Integer is_local;
        public Integer is_meizhi;
        public Integer is_membertop;
        public Integer is_multiforum_thread;
        public Integer is_notice;
        public Integer is_novel;
        public Integer is_novel_reward;
        public Integer is_novel_thank;
        public Integer is_ntitle;
        public Integer is_operate_thread;
        public Integer is_partial_visible;
        public Integer is_pic;
        public Integer is_pictxt;
        public Integer is_protal;
        public Integer is_s_card;
        public Integer is_share_thread;
        public Integer is_story_audit;
        public Integer is_tbread_dispatch;
        public String is_tiebaplus_ad;
        public Integer is_top;
        public String is_top_img;
        public Integer is_topic;
        public Integer is_videobiggie_recomthread;
        public Integer is_voice_thread;
        public Integer is_vote;
        public Integer is_xiuxiu_thread;
        public Item item;
        public List<HeadItem> item_star;
        public JNews jid;
        public Long last_read_pid;
        public User last_replyer;
        public String last_time;
        public Integer last_time_int;
        public String lego_card;
        public LinkThreadInfo link_info;
        public Integer literature_flag;
        public String live_post_type;
        public String livecover_src;
        public Lbs location;
        public List<FeedKV> log_param;
        public List<Media> media;
        public List<MediaNum> media_num;
        public String meizhi_pic;
        public Integer middle_page_num;
        public Integer middle_page_pass_flag;
        public String multi_forum_text;
        public List<MultipleForum> multiple_forum_list;
        public SmartApp naws_info;
        public String nid;
        public Integer operator_flag;
        public OriForumInfo ori_forum_info;
        public OriginThreadInfo origin_thread_info;
        public Integer pb_entry;
        public List<PbGoodsInfo> pb_goods_info;
        public List<PbLinkInfo> pb_link_info;
        public PeiwanInfo peiwan_info;
        public Media pic_info;
        public Integer pic_num;
        public String pids;
        public String placeholder_card_id;
        public PollInfo poll_info;
        public Integer poll_style;
        public Long post_id;
        public List<PostList> post_list;
        public Integer post_num;
        public String presentation_style;
        public PsInfo ps_info;
        public Integer push_end_time;
        public PushStatus push_status;
        public QuestionBonus question_bonus;
        public Integer readonly;
        public String recom_extra;
        public String recom_reason;
        public String recom_source;
        public String recom_tag_icon;
        public String recom_weight;
        public RecommendTip recommend_tip;
        public Integer reply_num;
        public List<ReportInfo> report_info;
        public Integer repost_num;
        public List<PbContent> rich_abstract;
        public List<PbContent> rich_title;
        public RobotEntrance robot_entrance;
        public Long robot_thread_type;
        public String scard_packet_id;
        public ThreadScoreInfo score_info;
        public Long share_num;
        public String share_url;
        public Integer show_ad_subscript;
        public Integer show_commented;
        public String show_ext_str;
        public Integer show_new_question_style;
        public ShowPostContent show_post_content;
        public List<User> show_user_list;
        public SkinInfo skin_info;
        public StarRankIcon star_rank_icon;
        public Integer storecount;
        public String t_share_img;
        public Integer tab_id;
        public String tab_name;
        public Integer tab_show_mode;
        public String target_scheme;
        public TaskInfo task_info;
        public TbreadDispatch tbread_dispatch_info;
        public Integer thread_album_id;
        public Integer thread_album_status;
        public List<ThreadRecommendInfo> thread_recommend_infos;
        public ThreadRecommendTag thread_recommend_tag;
        public String thread_share_link;
        public Integer thread_type;
        public Integer thread_types;
        public Long tid;
        public String tieba_game_information_source;
        public TiebaPlusAd tiebaplus_ad;
        public Integer tiebaplus_cant_delete;
        public Integer tiebaplus_da_type;
        public Integer tiebaplus_da_type_click;
        public String tiebaplus_extra_param;
        public String tiebaplus_order_id;
        public String tiebaplus_token;
        public Integer time;
        public Integer timeline;
        public String title;
        public String title_ai;
        public Post top_agree_post;
        public Long top_thread_set_time;
        public Topic topic;
        public String topic_h5_url;
        public TopicModule topic_module;
        public String topic_user_name;
        public Long trans_num;
        public ZhiBoInfoTW twzhibo_info;
        public Integer valid_post_num;
        public String video;
        public AdInfo video_ad_info;
        public ThreadVideoCard video_card;
        public VideoChannelInfo video_channel_info;
        public String video_cover;
        public String video_id;
        public VideoInfo video_info;
        public String video_mobile_url;
        public ThreadVideoOtherInfo video_other_info;
        public VideoDesc video_segment;
        public String video_swf;
        public VideoActive videoactive_info;
        public Integer view_num;
        public List<Voice> voice_info;
        public VoiceRoom voice_room;
        public String wonderful_post_info;
        public WorksInfo works_info;
        public YulePostActivity yule_post_activity;
        public Zan zan;

        public Builder() {
        }

        public Builder(ThreadInfo threadInfo) {
            super(threadInfo);
            if (threadInfo == null) {
                return;
            }
            this.id = threadInfo.id;
            this.tid = threadInfo.tid;
            this.title = threadInfo.title;
            this.reply_num = threadInfo.reply_num;
            this.view_num = threadInfo.view_num;
            this.last_time = threadInfo.last_time;
            this.last_time_int = threadInfo.last_time_int;
            this.thread_types = threadInfo.thread_types;
            this.is_top = threadInfo.is_top;
            this.is_good = threadInfo.is_good;
            this.is_vote = threadInfo.is_vote;
            this.is_bakan = threadInfo.is_bakan;
            this.is_protal = threadInfo.is_protal;
            this.is_meizhi = threadInfo.is_meizhi;
            this.is_voice_thread = threadInfo.is_voice_thread;
            this.is_activity = threadInfo.is_activity;
            this.is_notice = threadInfo.is_notice;
            this.author = threadInfo.author;
            this.last_replyer = threadInfo.last_replyer;
            this.comment_num = threadInfo.comment_num;
            this._abstract = Message.copyOf(threadInfo._abstract);
            this.media = Message.copyOf(threadInfo.media);
            this.voice_info = Message.copyOf(threadInfo.voice_info);
            this.meizhi_pic = threadInfo.meizhi_pic;
            this.media_num = Message.copyOf(threadInfo.media_num);
            this.thread_type = threadInfo.thread_type;
            this.fid = threadInfo.fid;
            this.fname = threadInfo.fname;
            this.live_post_type = threadInfo.live_post_type;
            this.is_livepost = threadInfo.is_livepost;
            this.show_commented = threadInfo.show_commented;
            this.click_url = threadInfo.click_url;
            this.video = threadInfo.video;
            this.video_swf = threadInfo.video_swf;
            this.video_cover = threadInfo.video_cover;
            this.video_id = threadInfo.video_id;
            this.video_mobile_url = threadInfo.video_mobile_url;
            this.is_ntitle = threadInfo.is_ntitle;
            this.is_bub = threadInfo.is_bub;
            this.first_post_id = threadInfo.first_post_id;
            this.zan = threadInfo.zan;
            this.is_global_top = threadInfo.is_global_top;
            this.is_pic = threadInfo.is_pic;
            this.post_list = Message.copyOf(threadInfo.post_list);
            this.create_time = threadInfo.create_time;
            this.repost_num = threadInfo.repost_num;
            this.topic = threadInfo.topic;
            this.has_commented = threadInfo.has_commented;
            this.from = threadInfo.from;
            this.collect_status = threadInfo.collect_status;
            this.collect_mark_pid = threadInfo.collect_mark_pid;
            this.post_id = threadInfo.post_id;
            this.time = threadInfo.time;
            this.is_membertop = threadInfo.is_membertop;
            this.anchor_info = threadInfo.anchor_info;
            this.author_id = threadInfo.author_id;
            this.valid_post_num = threadInfo.valid_post_num;
            this.isLzDeleteAll = threadInfo.isLzDeleteAll;
            this.is_ad = threadInfo.is_ad;
            this.ecom = threadInfo.ecom;
            this.pids = threadInfo.pids;
            this.location = threadInfo.location;
            this.guess = threadInfo.guess;
            this.timeline = threadInfo.timeline;
            this.act_info = Message.copyOf(threadInfo.act_info);
            this.hot_weight = threadInfo.hot_weight;
            this.livecover_src = threadInfo.livecover_src;
            this.storecount = threadInfo.storecount;
            this.post_num = threadInfo.post_num;
            this.hotTWInfo = threadInfo.hotTWInfo;
            this.twzhibo_info = threadInfo.twzhibo_info;
            this.category_name = threadInfo.category_name;
            this.poll_info = threadInfo.poll_info;
            this.jid = threadInfo.jid;
            this.is_novel = threadInfo.is_novel;
            this.is_novel_thank = threadInfo.is_novel_thank;
            this.is_novel_reward = threadInfo.is_novel_reward;
            this.video_info = threadInfo.video_info;
            this.push_end_time = threadInfo.push_end_time;
            this.is_copythread = threadInfo.is_copythread;
            this.operator_flag = threadInfo.operator_flag;
            this.task_info = threadInfo.task_info;
            this.pic_num = threadInfo.pic_num;
            this.is_godthread_recommend = threadInfo.is_godthread_recommend;
            this.yule_post_activity = threadInfo.yule_post_activity;
            this.app_code = threadInfo.app_code;
            this.ext_tails = Message.copyOf(threadInfo.ext_tails);
            this.push_status = threadInfo.push_status;
            this.cartoon_info = threadInfo.cartoon_info;
            this.lego_card = threadInfo.lego_card;
            this.high_together = threadInfo.high_together;
            this.videoactive_info = threadInfo.videoactive_info;
            this.is_deal = threadInfo.is_deal;
            this.deal_info = threadInfo.deal_info;
            this.animation_info = threadInfo.animation_info;
            this.skin_info = threadInfo.skin_info;
            this.ps_info = threadInfo.ps_info;
            this.book_chapter = threadInfo.book_chapter;
            this.is_book_chapter = threadInfo.is_book_chapter;
            this.recom_source = threadInfo.recom_source;
            this.recom_weight = threadInfo.recom_weight;
            this.last_read_pid = threadInfo.last_read_pid;
            this.cheak_repeat = threadInfo.cheak_repeat;
            this.ab_tag = threadInfo.ab_tag;
            this.recom_reason = threadInfo.recom_reason;
            this.video_ad_info = threadInfo.video_ad_info;
            this.rich_title = Message.copyOf(threadInfo.rich_title);
            this.rich_abstract = Message.copyOf(threadInfo.rich_abstract);
            this.ala_info = threadInfo.ala_info;
            this.is_operate_thread = threadInfo.is_operate_thread;
            this.is_tbread_dispatch = threadInfo.is_tbread_dispatch;
            this.tbread_dispatch_info = threadInfo.tbread_dispatch_info;
            this.app_info = threadInfo.app_info;
            this.report_info = Message.copyOf(threadInfo.report_info);
            this.video_channel_info = threadInfo.video_channel_info;
            this.dislike_info = Message.copyOf(threadInfo.dislike_info);
            this.declare_list = Message.copyOf(threadInfo.declare_list);
            this.multiple_forum_list = Message.copyOf(threadInfo.multiple_forum_list);
            this.is_multiforum_thread = threadInfo.is_multiforum_thread;
            this.agree_num = threadInfo.agree_num;
            this.top_agree_post = threadInfo.top_agree_post;
            this.agree = threadInfo.agree;
            this.is_partial_visible = threadInfo.is_partial_visible;
            this.is_link_thread = threadInfo.is_link_thread;
            this.link_info = threadInfo.link_info;
            this.freq_num = threadInfo.freq_num;
            this.is_god = threadInfo.is_god;
            this.activity_info = threadInfo.activity_info;
            this.pic_info = threadInfo.pic_info;
            this.is_story_audit = threadInfo.is_story_audit;
            this.share_num = threadInfo.share_num;
            this.is_called = threadInfo.is_called;
            this.tieba_game_information_source = threadInfo.tieba_game_information_source;
            this.audit_time = threadInfo.audit_time;
            this.middle_page_num = threadInfo.middle_page_num;
            this.middle_page_pass_flag = threadInfo.middle_page_pass_flag;
            this.origin_thread_info = threadInfo.origin_thread_info;
            this.first_post_content = Message.copyOf(threadInfo.first_post_content);
            this.is_share_thread = threadInfo.is_share_thread;
            this.recom_extra = threadInfo.recom_extra;
            this.trans_num = threadInfo.trans_num;
            this.multi_forum_text = threadInfo.multi_forum_text;
            this.star_rank_icon = threadInfo.star_rank_icon;
            this.is_topic = threadInfo.is_topic;
            this.topic_user_name = threadInfo.topic_user_name;
            this.topic_h5_url = threadInfo.topic_h5_url;
            this.presentation_style = threadInfo.presentation_style;
            this.ori_forum_info = threadInfo.ori_forum_info;
            this.is_videobiggie_recomthread = threadInfo.is_videobiggie_recomthread;
            this.daily_paper_time = threadInfo.daily_paper_time;
            this.forum_info = threadInfo.forum_info;
            this.naws_info = threadInfo.naws_info;
            this.video_segment = threadInfo.video_segment;
            this.is_top_img = threadInfo.is_top_img;
            this.t_share_img = threadInfo.t_share_img;
            this.topic_module = threadInfo.topic_module;
            this.is_bjh = threadInfo.is_bjh;
            this.article_cover = threadInfo.article_cover;
            this.bjh_content_tag = threadInfo.bjh_content_tag;
            this.nid = threadInfo.nid;
            this.is_headlinepost = threadInfo.is_headlinepost;
            this.baijiahao = threadInfo.baijiahao;
            this.is_s_card = threadInfo.is_s_card;
            this.scard_packet_id = threadInfo.scard_packet_id;
            this.thread_share_link = threadInfo.thread_share_link;
            this.if_comment = threadInfo.if_comment;
            this.if_comment_info = threadInfo.if_comment_info;
            this.tab_id = threadInfo.tab_id;
            this.tab_name = threadInfo.tab_name;
            this.wonderful_post_info = threadInfo.wonderful_post_info;
            this.pb_link_info = Message.copyOf(threadInfo.pb_link_info);
            this.item = threadInfo.item;
            this.item_star = Message.copyOf(threadInfo.item_star);
            this.is_deleted = threadInfo.is_deleted;
            this.hot_num = threadInfo.hot_num;
            this.pb_goods_info = Message.copyOf(threadInfo.pb_goods_info);
            this.is_local = threadInfo.is_local;
            this.pb_entry = threadInfo.pb_entry;
            this.is_author_view = threadInfo.is_author_view;
            this.forum_user_live_msg = threadInfo.forum_user_live_msg;
            this.forum_friend_watching_info = threadInfo.forum_friend_watching_info;
            this.works_info = threadInfo.works_info;
            this.collect_num = threadInfo.collect_num;
            this.thread_recommend_infos = Message.copyOf(threadInfo.thread_recommend_infos);
            this.recom_tag_icon = threadInfo.recom_tag_icon;
            this.is_tiebaplus_ad = threadInfo.is_tiebaplus_ad;
            this.tiebaplus_order_id = threadInfo.tiebaplus_order_id;
            this.tiebaplus_token = threadInfo.tiebaplus_token;
            this.tiebaplus_extra_param = threadInfo.tiebaplus_extra_param;
            this.tiebaplus_cant_delete = threadInfo.tiebaplus_cant_delete;
            this.is_frs_mask = threadInfo.is_frs_mask;
            this.voice_room = threadInfo.voice_room;
            this.tab_show_mode = threadInfo.tab_show_mode;
            this.tiebaplus_ad = threadInfo.tiebaplus_ad;
            this.recommend_tip = threadInfo.recommend_tip;
            this.edit_info = threadInfo.edit_info;
            this.is_pictxt = threadInfo.is_pictxt;
            this.exposure_monitor_url = threadInfo.exposure_monitor_url;
            this.click_monitor_url = threadInfo.click_monitor_url;
            this.readonly = threadInfo.readonly;
            this.thread_recommend_tag = threadInfo.thread_recommend_tag;
            this.custom_figure = threadInfo.custom_figure;
            this.custom_state = threadInfo.custom_state;
            this.is_highlight = threadInfo.is_highlight;
            this.is_xiuxiu_thread = threadInfo.is_xiuxiu_thread;
            this.ablum_info = threadInfo.ablum_info;
            this.show_ad_subscript = threadInfo.show_ad_subscript;
            this.target_scheme = threadInfo.target_scheme;
            this.convert_btn_type = threadInfo.convert_btn_type;
            this.is_excellent_thread = threadInfo.is_excellent_thread;
            this.literature_flag = threadInfo.literature_flag;
            this.hot_post_list = Message.copyOf(threadInfo.hot_post_list);
            this.robot_entrance = threadInfo.robot_entrance;
            this.click_back_card = threadInfo.click_back_card;
            this.peiwan_info = threadInfo.peiwan_info;
            this.robot_thread_type = threadInfo.robot_thread_type;
            this.book_id = threadInfo.book_id;
            this.head_type = threadInfo.head_type;
            this.disable_share = threadInfo.disable_share;
            this.disable_share_toast = threadInfo.disable_share_toast;
            this.share_url = threadInfo.share_url;
            this.top_thread_set_time = threadInfo.top_thread_set_time;
            this.business_mix = threadInfo.business_mix;
            this.chat_private = threadInfo.chat_private;
            this.log_param = Message.copyOf(threadInfo.log_param);
            this.aichat_bot_card = threadInfo.aichat_bot_card;
            this.icon_mark = Message.copyOf(threadInfo.icon_mark);
            this.game_ext = threadInfo.game_ext;
            this.placeholder_card_id = threadInfo.placeholder_card_id;
            this.is_hottop_thread = threadInfo.is_hottop_thread;
            this.disable_reply = threadInfo.disable_reply;
            this.score_info = threadInfo.score_info;
            this.show_post_content = threadInfo.show_post_content;
            this.show_user_list = Message.copyOf(threadInfo.show_user_list);
            this.show_ext_str = threadInfo.show_ext_str;
            this.show_new_question_style = threadInfo.show_new_question_style;
            this.title_ai = threadInfo.title_ai;
            this.full_post_list = Message.copyOf(threadInfo.full_post_list);
            this.thread_album_id = threadInfo.thread_album_id;
            this.draw_info = threadInfo.draw_info;
            this.hotest_post = threadInfo.hotest_post;
            this.thread_album_status = threadInfo.thread_album_status;
            this.question_bonus = threadInfo.question_bonus;
            this.tiebaplus_da_type = threadInfo.tiebaplus_da_type;
            this.tiebaplus_da_type_click = threadInfo.tiebaplus_da_type_click;
            this.video_card = threadInfo.video_card;
            this.poll_style = threadInfo.poll_style;
            this.feed_nid = threadInfo.feed_nid;
            this.video_other_info = threadInfo.video_other_info;
        }

        @Override // com.squareup.wire.Message.Builder
        public ThreadInfo build(boolean z) {
            return new ThreadInfo(this, z);
        }
    }
}