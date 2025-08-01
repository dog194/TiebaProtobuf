package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class Post extends Message {
    public static final String DEFAULT_BIMG_URL = "";
    public static final String DEFAULT_BOT_REPLY_CONTENT = "";
    public static final String DEFAULT_DYNAMIC_URL = "";
    public static final String DEFAULT_FOLD_COMMENT_APPLY_URL = "";
    public static final String DEFAULT_FOLD_TIP = "";
    public static final String DEFAULT_FOOTER = "";
    public static final String DEFAULT_ICON_URL = "";
    public static final String DEFAULT_IOS_BIMG_FORMAT = "";
    public static final String DEFAULT_IOS_B_URL = "";
    public static final String DEFAULT_LEGO_CARD = "";
    public static final String DEFAULT_QUOTE_ID = "";
    public static final String DEFAULT_RUMOR_SOURCE_IMG = "";
    public static final String DEFAULT_TIME_EX = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_TMONEY = "";
    public static final String DEFAULT_TOUTIAO_CARD_TAG = "";
    public static final String DEFAULT_TOUTIAO_CARD_TAG_COLOR = "";
    public static final String DEFAULT_VOTE_CRYPT = "";

    @ProtoField(tag = 27)
    public final ActPost act_post;

    @ProtoField(tag = 16)
    public final AddPostList add_post_list;

    @ProtoField(tag = 20, type = Message.Datatype.UINT32)
    public final Integer add_post_number;

    @ProtoField(tag = 55)
    public final Advertisement advertisement;

    @ProtoField(tag = 37)
    public final Agree agree;

    @ProtoField(tag = 80)
    public final AichatBotCommentCard aichat_bot_comment_card;

    @ProtoField(tag = 77)
    public final AigcFeedbackInfo aigc_feedback_info;

    @ProtoField(label = Message.Label.REPEATED, tag = 6, type = Message.Datatype.STRING)
    public final List<String> arr_video;

    @ProtoField(tag = 23)
    public final User author;

    @ProtoField(tag = 19, type = Message.Datatype.INT64)
    public final Long author_id;

    @ProtoField(tag = 90)
    public final BdtSearchInfo bdt_search_info;

    @ProtoField(tag = 91, type = Message.Datatype.INT32)
    public final Integer bdt_user_adopt;

    @ProtoField(tag = 17, type = Message.Datatype.STRING)
    public final String bimg_url;

    @ProtoField(tag = 74, type = Message.Datatype.STRING)
    public final String bot_reply_content;

    @ProtoField(label = Message.Label.REPEATED, tag = 75)
    public final List<BotReplyContent> bot_reply_content_list;

    @ProtoField(tag = 64)
    public final ThemeBubble bubble_info;

    @ProtoField(tag = 72)
    public final CallRobotEntrance call_robot_entrance;

    @ProtoField(label = Message.Label.REPEATED, tag = 59)
    public final List<CardLinkInfo> card_link_info;

    @ProtoField(tag = 78)
    public final ChatContent chat_content;

    @ProtoField(label = Message.Label.REPEATED, tag = 5)
    public final List<PbContent> content;

    @ProtoField(tag = 60)
    public final CustomFigure custom_figure;

    @ProtoField(tag = 61)
    public final CustomState custom_state;

    @ProtoField(tag = 63, type = Message.Datatype.STRING)
    public final String dynamic_url;

    @ProtoField(label = Message.Label.REPEATED, tag = 32)
    public final List<TailInfo> ext_tails;

    @ProtoField(tag = 66)
    public final FestivalTipData festival_tip_data;

    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer floor;

    @ProtoField(tag = 57, type = Message.Datatype.STRING)
    public final String fold_comment_apply_url;

    @ProtoField(tag = 56, type = Message.Datatype.INT32)
    public final Integer fold_comment_status;

    @ProtoField(tag = 44, type = Message.Datatype.STRING)
    public final String fold_tip;

    @ProtoField(tag = 89, type = Message.Datatype.STRING)
    public final String footer;

    @ProtoField(tag = 38)
    public final SimpleForum from_forum;

    @ProtoField(tag = 62)
    public final FullLengthNovel full_length_novel;

    @ProtoField(label = Message.Label.REPEATED, tag = 83)
    public final List<FeedHeadSymbol> head_extra_info;

    @ProtoField(tag = 33)
    public final TogetherHi high_together;

    @ProtoField(tag = 69, type = Message.Datatype.STRING)
    public final String icon_url;

    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long id;

    @ProtoField(tag = 41, type = Message.Datatype.INT32)
    public final Integer img_num_abtest;

    @ProtoField(tag = 87, type = Message.Datatype.STRING)
    public final String ios_b_url;

    @ProtoField(tag = 18, type = Message.Datatype.STRING)
    public final String ios_bimg_format;

    @ProtoField(tag = 48, type = Message.Datatype.INT32)
    public final Integer is_bjh;

    @ProtoField(tag = 73, type = Message.Datatype.INT32)
    public final Integer is_bot_reply;

    @ProtoField(tag = 11, type = Message.Datatype.UINT32)
    public final Integer is_bub;

    @ProtoField(tag = 43, type = Message.Datatype.INT32)
    public final Integer is_fold;

    @ProtoField(tag = 31, type = Message.Datatype.INT32)
    public final Integer is_hot_post;

    @ProtoField(tag = 10, type = Message.Datatype.UINT32)
    public final Integer is_ntitle;

    @ProtoField(tag = 39, type = Message.Datatype.INT32)
    public final Integer is_post_visible;

    @ProtoField(tag = 45, type = Message.Datatype.INT32)
    public final Integer is_top_agree_post;

    @ProtoField(tag = 9, type = Message.Datatype.UINT32)
    public final Integer is_voice;

    @ProtoField(tag = 8, type = Message.Datatype.UINT32)
    public final Integer is_vote;

    @ProtoField(tag = 51, type = Message.Datatype.INT32)
    public final Integer is_wonderful_post;

    @ProtoField(tag = 53)
    public final Item item;

    @ProtoField(label = Message.Label.REPEATED, tag = 52)
    public final List<HeadItem> item_star;

    @ProtoField(tag = 7)
    public final Lbs lbs_info;

    @ProtoField(tag = 36, type = Message.Datatype.STRING)
    public final String lego_card;

    @ProtoField(label = Message.Label.REPEATED, tag = 81)
    public final List<FeedKV> log_param;

    @ProtoField(tag = 40, type = Message.Datatype.INT32)
    public final Integer need_log;

    @ProtoField(label = Message.Label.REPEATED, tag = 85)
    public final List<PbContent> no_pic_content;

    @ProtoField(tag = 58)
    public final NovelInfo novel_info;

    @ProtoField(tag = 67)
    public final NovelRecomCard novel_recom_card;

    @ProtoField(tag = 42)
    public final OriginThreadInfo origin_thread_info;

    @ProtoField(tag = 54)
    public final Item outer_item;

    @ProtoField(tag = 35)
    public final DealInfo pb_deal_info;

    @ProtoField(label = Message.Label.REPEATED, tag = 84)
    public final List<PbContent> pic_content;

    @ProtoField(tag = 30)
    public final PbPostZan post_zan;

    @ProtoField(tag = 28)
    public final PbPresent present;

    @ProtoField(tag = 50, type = Message.Datatype.STRING)
    public final String quote_id;

    @ProtoField(label = Message.Label.REPEATED, tag = 76)
    public final List<RobotSkill> robot_skill;

    @ProtoField(tag = 65, type = Message.Datatype.STRING)
    public final String rumor_source_img;

    @ProtoField(tag = 68, type = Message.Datatype.INT32)
    public final Integer shield_icon;

    @ProtoField(tag = 47, type = Message.Datatype.INT32)
    public final Integer show_squared;

    @ProtoField(tag = 21)
    public final SignatureData signature;

    @ProtoField(tag = 34)
    public final SkinInfo skin_info;

    @ProtoField(tag = 88)
    public final SpecialPost special_post;

    @ProtoField(tag = 79)
    public final SpriteMemeInfo sprite_meme_info;

    @ProtoField(tag = 82)
    public final IconMark stamp_info;

    @ProtoField(tag = 25, type = Message.Datatype.INT32)
    public final Integer storecount;

    @ProtoField(tag = 15)
    public final SubPost sub_post_list;

    @ProtoField(tag = 13, type = Message.Datatype.UINT32)
    public final Integer sub_post_number;

    @ProtoField(tag = 22)
    public final TailInfo tail_info;

    @ProtoField(tag = 86)
    public final ThemeTailInUser tail_style;

    @ProtoField(tag = 46, type = Message.Datatype.INT64)
    public final Long tid;

    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer time;

    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String time_ex;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;

    @ProtoField(tag = 92, type = Message.Datatype.STRING)
    public final String tmoney;

    @ProtoField(tag = 70, type = Message.Datatype.STRING)
    public final String toutiao_card_tag;

    @ProtoField(tag = 71, type = Message.Datatype.STRING)
    public final String toutiao_card_tag_color;

    @ProtoField(tag = 26)
    public final TPointPost tpoint_post;

    @ProtoField(tag = 29)
    public final VideoInfo video_info;

    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String vote_crypt;

    @ProtoField(tag = 24)
    public final Zan zan;
    public static final Long DEFAULT_ID = 0L;
    public static final Integer DEFAULT_FLOOR = 0;
    public static final Integer DEFAULT_TIME = 0;
    public static final List<PbContent> DEFAULT_CONTENT = Collections.emptyList();
    public static final List<String> DEFAULT_ARR_VIDEO = Collections.emptyList();
    public static final Integer DEFAULT_IS_VOTE = 0;
    public static final Integer DEFAULT_IS_VOICE = 0;
    public static final Integer DEFAULT_IS_NTITLE = 0;
    public static final Integer DEFAULT_IS_BUB = 0;
    public static final Integer DEFAULT_SUB_POST_NUMBER = 0;
    public static final Long DEFAULT_AUTHOR_ID = 0L;
    public static final Integer DEFAULT_ADD_POST_NUMBER = 0;
    public static final Integer DEFAULT_STORECOUNT = 0;
    public static final Integer DEFAULT_IS_HOT_POST = 0;
    public static final List<TailInfo> DEFAULT_EXT_TAILS = Collections.emptyList();
    public static final Integer DEFAULT_IS_POST_VISIBLE = 0;
    public static final Integer DEFAULT_NEED_LOG = 0;
    public static final Integer DEFAULT_IMG_NUM_ABTEST = 0;
    public static final Integer DEFAULT_IS_FOLD = 0;
    public static final Integer DEFAULT_IS_TOP_AGREE_POST = 0;
    public static final Long DEFAULT_TID = 0L;
    public static final Integer DEFAULT_SHOW_SQUARED = 0;
    public static final Integer DEFAULT_IS_BJH = 0;
    public static final Integer DEFAULT_IS_WONDERFUL_POST = 0;
    public static final List<HeadItem> DEFAULT_ITEM_STAR = Collections.emptyList();
    public static final Integer DEFAULT_FOLD_COMMENT_STATUS = 0;
    public static final List<CardLinkInfo> DEFAULT_CARD_LINK_INFO = Collections.emptyList();
    public static final Integer DEFAULT_SHIELD_ICON = 0;
    public static final Integer DEFAULT_IS_BOT_REPLY = 0;
    public static final List<BotReplyContent> DEFAULT_BOT_REPLY_CONTENT_LIST = Collections.emptyList();
    public static final List<RobotSkill> DEFAULT_ROBOT_SKILL = Collections.emptyList();
    public static final List<FeedKV> DEFAULT_LOG_PARAM = Collections.emptyList();
    public static final List<FeedHeadSymbol> DEFAULT_HEAD_EXTRA_INFO = Collections.emptyList();
    public static final List<PbContent> DEFAULT_PIC_CONTENT = Collections.emptyList();
    public static final List<PbContent> DEFAULT_NO_PIC_CONTENT = Collections.emptyList();
    public static final Integer DEFAULT_BDT_USER_ADOPT = 0;

    public static final class Builder extends Message.Builder<Post> {
        public ActPost act_post;
        public AddPostList add_post_list;
        public Integer add_post_number;
        public Advertisement advertisement;
        public Agree agree;
        public AichatBotCommentCard aichat_bot_comment_card;
        public AigcFeedbackInfo aigc_feedback_info;
        public List<String> arr_video;
        public User author;
        public Long author_id;
        public BdtSearchInfo bdt_search_info;
        public Integer bdt_user_adopt;
        public String bimg_url;
        public String bot_reply_content;
        public List<BotReplyContent> bot_reply_content_list;
        public ThemeBubble bubble_info;
        public CallRobotEntrance call_robot_entrance;
        public List<CardLinkInfo> card_link_info;
        public ChatContent chat_content;
        public List<PbContent> content;
        public CustomFigure custom_figure;
        public CustomState custom_state;
        public String dynamic_url;
        public List<TailInfo> ext_tails;
        public FestivalTipData festival_tip_data;
        public Integer floor;
        public String fold_comment_apply_url;
        public Integer fold_comment_status;
        public String fold_tip;
        public String footer;
        public SimpleForum from_forum;
        public FullLengthNovel full_length_novel;
        public List<FeedHeadSymbol> head_extra_info;
        public TogetherHi high_together;
        public String icon_url;
        public Long id;
        public Integer img_num_abtest;
        public String ios_b_url;
        public String ios_bimg_format;
        public Integer is_bjh;
        public Integer is_bot_reply;
        public Integer is_bub;
        public Integer is_fold;
        public Integer is_hot_post;
        public Integer is_ntitle;
        public Integer is_post_visible;
        public Integer is_top_agree_post;
        public Integer is_voice;
        public Integer is_vote;
        public Integer is_wonderful_post;
        public Item item;
        public List<HeadItem> item_star;
        public Lbs lbs_info;
        public String lego_card;
        public List<FeedKV> log_param;
        public Integer need_log;
        public List<PbContent> no_pic_content;
        public NovelInfo novel_info;
        public NovelRecomCard novel_recom_card;
        public OriginThreadInfo origin_thread_info;
        public Item outer_item;
        public DealInfo pb_deal_info;
        public List<PbContent> pic_content;
        public PbPostZan post_zan;
        public PbPresent present;
        public String quote_id;
        public List<RobotSkill> robot_skill;
        public String rumor_source_img;
        public Integer shield_icon;
        public Integer show_squared;
        public SignatureData signature;
        public SkinInfo skin_info;
        public SpecialPost special_post;
        public SpriteMemeInfo sprite_meme_info;
        public IconMark stamp_info;
        public Integer storecount;
        public SubPost sub_post_list;
        public Integer sub_post_number;
        public TailInfo tail_info;
        public ThemeTailInUser tail_style;
        public Long tid;
        public Integer time;
        public String time_ex;
        public String title;
        public String tmoney;
        public String toutiao_card_tag;
        public String toutiao_card_tag_color;
        public TPointPost tpoint_post;
        public VideoInfo video_info;
        public String vote_crypt;
        public Zan zan;

        public Builder() {
        }

        public Builder(Post post) {
            super(post);
            if (post == null) {
                return;
            }
            this.id = post.id;
            this.title = post.title;
            this.floor = post.floor;
            this.time = post.time;
            this.content = Message.copyOf(post.content);
            this.arr_video = Message.copyOf(post.arr_video);
            this.lbs_info = post.lbs_info;
            this.is_vote = post.is_vote;
            this.is_voice = post.is_voice;
            this.is_ntitle = post.is_ntitle;
            this.is_bub = post.is_bub;
            this.vote_crypt = post.vote_crypt;
            this.sub_post_number = post.sub_post_number;
            this.time_ex = post.time_ex;
            this.sub_post_list = post.sub_post_list;
            this.add_post_list = post.add_post_list;
            this.bimg_url = post.bimg_url;
            this.ios_bimg_format = post.ios_bimg_format;
            this.author_id = post.author_id;
            this.add_post_number = post.add_post_number;
            this.signature = post.signature;
            this.tail_info = post.tail_info;
            this.author = post.author;
            this.zan = post.zan;
            this.storecount = post.storecount;
            this.tpoint_post = post.tpoint_post;
            this.act_post = post.act_post;
            this.present = post.present;
            this.video_info = post.video_info;
            this.post_zan = post.post_zan;
            this.is_hot_post = post.is_hot_post;
            this.ext_tails = Message.copyOf(post.ext_tails);
            this.high_together = post.high_together;
            this.skin_info = post.skin_info;
            this.pb_deal_info = post.pb_deal_info;
            this.lego_card = post.lego_card;
            this.agree = post.agree;
            this.from_forum = post.from_forum;
            this.is_post_visible = post.is_post_visible;
            this.need_log = post.need_log;
            this.img_num_abtest = post.img_num_abtest;
            this.origin_thread_info = post.origin_thread_info;
            this.is_fold = post.is_fold;
            this.fold_tip = post.fold_tip;
            this.is_top_agree_post = post.is_top_agree_post;
            this.tid = post.tid;
            this.show_squared = post.show_squared;
            this.is_bjh = post.is_bjh;
            this.quote_id = post.quote_id;
            this.is_wonderful_post = post.is_wonderful_post;
            this.item_star = Message.copyOf(post.item_star);
            this.item = post.item;
            this.outer_item = post.outer_item;
            this.advertisement = post.advertisement;
            this.fold_comment_status = post.fold_comment_status;
            this.fold_comment_apply_url = post.fold_comment_apply_url;
            this.novel_info = post.novel_info;
            this.card_link_info = Message.copyOf(post.card_link_info);
            this.custom_figure = post.custom_figure;
            this.custom_state = post.custom_state;
            this.full_length_novel = post.full_length_novel;
            this.dynamic_url = post.dynamic_url;
            this.bubble_info = post.bubble_info;
            this.rumor_source_img = post.rumor_source_img;
            this.festival_tip_data = post.festival_tip_data;
            this.novel_recom_card = post.novel_recom_card;
            this.shield_icon = post.shield_icon;
            this.icon_url = post.icon_url;
            this.toutiao_card_tag = post.toutiao_card_tag;
            this.toutiao_card_tag_color = post.toutiao_card_tag_color;
            this.call_robot_entrance = post.call_robot_entrance;
            this.is_bot_reply = post.is_bot_reply;
            this.bot_reply_content = post.bot_reply_content;
            this.bot_reply_content_list = Message.copyOf(post.bot_reply_content_list);
            this.robot_skill = Message.copyOf(post.robot_skill);
            this.aigc_feedback_info = post.aigc_feedback_info;
            this.chat_content = post.chat_content;
            this.sprite_meme_info = post.sprite_meme_info;
            this.aichat_bot_comment_card = post.aichat_bot_comment_card;
            this.log_param = Message.copyOf(post.log_param);
            this.stamp_info = post.stamp_info;
            this.head_extra_info = Message.copyOf(post.head_extra_info);
            this.pic_content = Message.copyOf(post.pic_content);
            this.no_pic_content = Message.copyOf(post.no_pic_content);
            this.tail_style = post.tail_style;
            this.ios_b_url = post.ios_b_url;
            this.special_post = post.special_post;
            this.footer = post.footer;
            this.bdt_search_info = post.bdt_search_info;
            this.bdt_user_adopt = post.bdt_user_adopt;
            this.tmoney = post.tmoney;
        }

        @Override // com.squareup.wire.Message.Builder
        public Post build(boolean z) {
            return new Post(this, z);
        }
    }

    public Post(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.id;
            if (l == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = l;
            }
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            Integer num = builder.floor;
            if (num == null) {
                this.floor = DEFAULT_FLOOR;
            } else {
                this.floor = num;
            }
            Integer num2 = builder.time;
            if (num2 == null) {
                this.time = DEFAULT_TIME;
            } else {
                this.time = num2;
            }
            List<PbContent> list = builder.content;
            if (list == null) {
                this.content = DEFAULT_CONTENT;
            } else {
                this.content = Message.immutableCopyOf(list);
            }
            List<String> list2 = builder.arr_video;
            if (list2 == null) {
                this.arr_video = DEFAULT_ARR_VIDEO;
            } else {
                this.arr_video = Message.immutableCopyOf(list2);
            }
            this.lbs_info = builder.lbs_info;
            Integer num3 = builder.is_vote;
            if (num3 == null) {
                this.is_vote = DEFAULT_IS_VOTE;
            } else {
                this.is_vote = num3;
            }
            Integer num4 = builder.is_voice;
            if (num4 == null) {
                this.is_voice = DEFAULT_IS_VOICE;
            } else {
                this.is_voice = num4;
            }
            Integer num5 = builder.is_ntitle;
            if (num5 == null) {
                this.is_ntitle = DEFAULT_IS_NTITLE;
            } else {
                this.is_ntitle = num5;
            }
            Integer num6 = builder.is_bub;
            if (num6 == null) {
                this.is_bub = DEFAULT_IS_BUB;
            } else {
                this.is_bub = num6;
            }
            String str2 = builder.vote_crypt;
            if (str2 == null) {
                this.vote_crypt = "";
            } else {
                this.vote_crypt = str2;
            }
            Integer num7 = builder.sub_post_number;
            if (num7 == null) {
                this.sub_post_number = DEFAULT_SUB_POST_NUMBER;
            } else {
                this.sub_post_number = num7;
            }
            String str3 = builder.time_ex;
            if (str3 == null) {
                this.time_ex = "";
            } else {
                this.time_ex = str3;
            }
            this.sub_post_list = builder.sub_post_list;
            this.add_post_list = builder.add_post_list;
            String str4 = builder.bimg_url;
            if (str4 == null) {
                this.bimg_url = "";
            } else {
                this.bimg_url = str4;
            }
            String str5 = builder.ios_bimg_format;
            if (str5 == null) {
                this.ios_bimg_format = "";
            } else {
                this.ios_bimg_format = str5;
            }
            Long l2 = builder.author_id;
            if (l2 == null) {
                this.author_id = DEFAULT_AUTHOR_ID;
            } else {
                this.author_id = l2;
            }
            Integer num8 = builder.add_post_number;
            if (num8 == null) {
                this.add_post_number = DEFAULT_ADD_POST_NUMBER;
            } else {
                this.add_post_number = num8;
            }
            this.signature = builder.signature;
            this.tail_info = builder.tail_info;
            this.author = builder.author;
            this.zan = builder.zan;
            Integer num9 = builder.storecount;
            if (num9 == null) {
                this.storecount = DEFAULT_STORECOUNT;
            } else {
                this.storecount = num9;
            }
            this.tpoint_post = builder.tpoint_post;
            this.act_post = builder.act_post;
            this.present = builder.present;
            this.video_info = builder.video_info;
            this.post_zan = builder.post_zan;
            Integer num10 = builder.is_hot_post;
            if (num10 == null) {
                this.is_hot_post = DEFAULT_IS_HOT_POST;
            } else {
                this.is_hot_post = num10;
            }
            List<TailInfo> list3 = builder.ext_tails;
            if (list3 == null) {
                this.ext_tails = DEFAULT_EXT_TAILS;
            } else {
                this.ext_tails = Message.immutableCopyOf(list3);
            }
            this.high_together = builder.high_together;
            this.skin_info = builder.skin_info;
            this.pb_deal_info = builder.pb_deal_info;
            String str6 = builder.lego_card;
            if (str6 == null) {
                this.lego_card = "";
            } else {
                this.lego_card = str6;
            }
            this.agree = builder.agree;
            this.from_forum = builder.from_forum;
            Integer num11 = builder.is_post_visible;
            if (num11 == null) {
                this.is_post_visible = DEFAULT_IS_POST_VISIBLE;
            } else {
                this.is_post_visible = num11;
            }
            Integer num12 = builder.need_log;
            if (num12 == null) {
                this.need_log = DEFAULT_NEED_LOG;
            } else {
                this.need_log = num12;
            }
            Integer num13 = builder.img_num_abtest;
            if (num13 == null) {
                this.img_num_abtest = DEFAULT_IMG_NUM_ABTEST;
            } else {
                this.img_num_abtest = num13;
            }
            this.origin_thread_info = builder.origin_thread_info;
            Integer num14 = builder.is_fold;
            if (num14 == null) {
                this.is_fold = DEFAULT_IS_FOLD;
            } else {
                this.is_fold = num14;
            }
            String str7 = builder.fold_tip;
            if (str7 == null) {
                this.fold_tip = "";
            } else {
                this.fold_tip = str7;
            }
            Integer num15 = builder.is_top_agree_post;
            if (num15 == null) {
                this.is_top_agree_post = DEFAULT_IS_TOP_AGREE_POST;
            } else {
                this.is_top_agree_post = num15;
            }
            Long l3 = builder.tid;
            if (l3 == null) {
                this.tid = DEFAULT_TID;
            } else {
                this.tid = l3;
            }
            Integer num16 = builder.show_squared;
            if (num16 == null) {
                this.show_squared = DEFAULT_SHOW_SQUARED;
            } else {
                this.show_squared = num16;
            }
            Integer num17 = builder.is_bjh;
            if (num17 == null) {
                this.is_bjh = DEFAULT_IS_BJH;
            } else {
                this.is_bjh = num17;
            }
            String str8 = builder.quote_id;
            if (str8 == null) {
                this.quote_id = "";
            } else {
                this.quote_id = str8;
            }
            Integer num18 = builder.is_wonderful_post;
            if (num18 == null) {
                this.is_wonderful_post = DEFAULT_IS_WONDERFUL_POST;
            } else {
                this.is_wonderful_post = num18;
            }
            List<HeadItem> list4 = builder.item_star;
            if (list4 == null) {
                this.item_star = DEFAULT_ITEM_STAR;
            } else {
                this.item_star = Message.immutableCopyOf(list4);
            }
            this.item = builder.item;
            this.outer_item = builder.outer_item;
            this.advertisement = builder.advertisement;
            Integer num19 = builder.fold_comment_status;
            if (num19 == null) {
                this.fold_comment_status = DEFAULT_FOLD_COMMENT_STATUS;
            } else {
                this.fold_comment_status = num19;
            }
            String str9 = builder.fold_comment_apply_url;
            if (str9 == null) {
                this.fold_comment_apply_url = "";
            } else {
                this.fold_comment_apply_url = str9;
            }
            this.novel_info = builder.novel_info;
            List<CardLinkInfo> list5 = builder.card_link_info;
            if (list5 == null) {
                this.card_link_info = DEFAULT_CARD_LINK_INFO;
            } else {
                this.card_link_info = Message.immutableCopyOf(list5);
            }
            this.custom_figure = builder.custom_figure;
            this.custom_state = builder.custom_state;
            this.full_length_novel = builder.full_length_novel;
            String str10 = builder.dynamic_url;
            if (str10 == null) {
                this.dynamic_url = "";
            } else {
                this.dynamic_url = str10;
            }
            this.bubble_info = builder.bubble_info;
            String str11 = builder.rumor_source_img;
            if (str11 == null) {
                this.rumor_source_img = "";
            } else {
                this.rumor_source_img = str11;
            }
            this.festival_tip_data = builder.festival_tip_data;
            this.novel_recom_card = builder.novel_recom_card;
            Integer num20 = builder.shield_icon;
            if (num20 == null) {
                this.shield_icon = DEFAULT_SHIELD_ICON;
            } else {
                this.shield_icon = num20;
            }
            String str12 = builder.icon_url;
            if (str12 == null) {
                this.icon_url = "";
            } else {
                this.icon_url = str12;
            }
            String str13 = builder.toutiao_card_tag;
            if (str13 == null) {
                this.toutiao_card_tag = "";
            } else {
                this.toutiao_card_tag = str13;
            }
            String str14 = builder.toutiao_card_tag_color;
            if (str14 == null) {
                this.toutiao_card_tag_color = "";
            } else {
                this.toutiao_card_tag_color = str14;
            }
            this.call_robot_entrance = builder.call_robot_entrance;
            Integer num21 = builder.is_bot_reply;
            if (num21 == null) {
                this.is_bot_reply = DEFAULT_IS_BOT_REPLY;
            } else {
                this.is_bot_reply = num21;
            }
            String str15 = builder.bot_reply_content;
            if (str15 == null) {
                this.bot_reply_content = "";
            } else {
                this.bot_reply_content = str15;
            }
            List<BotReplyContent> list6 = builder.bot_reply_content_list;
            if (list6 == null) {
                this.bot_reply_content_list = DEFAULT_BOT_REPLY_CONTENT_LIST;
            } else {
                this.bot_reply_content_list = Message.immutableCopyOf(list6);
            }
            List<RobotSkill> list7 = builder.robot_skill;
            if (list7 == null) {
                this.robot_skill = DEFAULT_ROBOT_SKILL;
            } else {
                this.robot_skill = Message.immutableCopyOf(list7);
            }
            this.aigc_feedback_info = builder.aigc_feedback_info;
            this.chat_content = builder.chat_content;
            this.sprite_meme_info = builder.sprite_meme_info;
            this.aichat_bot_comment_card = builder.aichat_bot_comment_card;
            List<FeedKV> list8 = builder.log_param;
            if (list8 == null) {
                this.log_param = DEFAULT_LOG_PARAM;
            } else {
                this.log_param = Message.immutableCopyOf(list8);
            }
            this.stamp_info = builder.stamp_info;
            List<FeedHeadSymbol> list9 = builder.head_extra_info;
            if (list9 == null) {
                this.head_extra_info = DEFAULT_HEAD_EXTRA_INFO;
            } else {
                this.head_extra_info = Message.immutableCopyOf(list9);
            }
            List<PbContent> list10 = builder.pic_content;
            if (list10 == null) {
                this.pic_content = DEFAULT_PIC_CONTENT;
            } else {
                this.pic_content = Message.immutableCopyOf(list10);
            }
            List<PbContent> list11 = builder.no_pic_content;
            if (list11 == null) {
                this.no_pic_content = DEFAULT_NO_PIC_CONTENT;
            } else {
                this.no_pic_content = Message.immutableCopyOf(list11);
            }
            this.tail_style = builder.tail_style;
            String str16 = builder.ios_b_url;
            if (str16 == null) {
                this.ios_b_url = "";
            } else {
                this.ios_b_url = str16;
            }
            this.special_post = builder.special_post;
            String str17 = builder.footer;
            if (str17 == null) {
                this.footer = "";
            } else {
                this.footer = str17;
            }
            this.bdt_search_info = builder.bdt_search_info;
            Integer num22 = builder.bdt_user_adopt;
            if (num22 == null) {
                this.bdt_user_adopt = DEFAULT_BDT_USER_ADOPT;
            } else {
                this.bdt_user_adopt = num22;
            }
            String str18 = builder.tmoney;
            if (str18 == null) {
                this.tmoney = "";
                return;
            } else {
                this.tmoney = str18;
                return;
            }
        }
        this.id = builder.id;
        this.title = builder.title;
        this.floor = builder.floor;
        this.time = builder.time;
        this.content = Message.immutableCopyOf(builder.content);
        this.arr_video = Message.immutableCopyOf(builder.arr_video);
        this.lbs_info = builder.lbs_info;
        this.is_vote = builder.is_vote;
        this.is_voice = builder.is_voice;
        this.is_ntitle = builder.is_ntitle;
        this.is_bub = builder.is_bub;
        this.vote_crypt = builder.vote_crypt;
        this.sub_post_number = builder.sub_post_number;
        this.time_ex = builder.time_ex;
        this.sub_post_list = builder.sub_post_list;
        this.add_post_list = builder.add_post_list;
        this.bimg_url = builder.bimg_url;
        this.ios_bimg_format = builder.ios_bimg_format;
        this.author_id = builder.author_id;
        this.add_post_number = builder.add_post_number;
        this.signature = builder.signature;
        this.tail_info = builder.tail_info;
        this.author = builder.author;
        this.zan = builder.zan;
        this.storecount = builder.storecount;
        this.tpoint_post = builder.tpoint_post;
        this.act_post = builder.act_post;
        this.present = builder.present;
        this.video_info = builder.video_info;
        this.post_zan = builder.post_zan;
        this.is_hot_post = builder.is_hot_post;
        this.ext_tails = Message.immutableCopyOf(builder.ext_tails);
        this.high_together = builder.high_together;
        this.skin_info = builder.skin_info;
        this.pb_deal_info = builder.pb_deal_info;
        this.lego_card = builder.lego_card;
        this.agree = builder.agree;
        this.from_forum = builder.from_forum;
        this.is_post_visible = builder.is_post_visible;
        this.need_log = builder.need_log;
        this.img_num_abtest = builder.img_num_abtest;
        this.origin_thread_info = builder.origin_thread_info;
        this.is_fold = builder.is_fold;
        this.fold_tip = builder.fold_tip;
        this.is_top_agree_post = builder.is_top_agree_post;
        this.tid = builder.tid;
        this.show_squared = builder.show_squared;
        this.is_bjh = builder.is_bjh;
        this.quote_id = builder.quote_id;
        this.is_wonderful_post = builder.is_wonderful_post;
        this.item_star = Message.immutableCopyOf(builder.item_star);
        this.item = builder.item;
        this.outer_item = builder.outer_item;
        this.advertisement = builder.advertisement;
        this.fold_comment_status = builder.fold_comment_status;
        this.fold_comment_apply_url = builder.fold_comment_apply_url;
        this.novel_info = builder.novel_info;
        this.card_link_info = Message.immutableCopyOf(builder.card_link_info);
        this.custom_figure = builder.custom_figure;
        this.custom_state = builder.custom_state;
        this.full_length_novel = builder.full_length_novel;
        this.dynamic_url = builder.dynamic_url;
        this.bubble_info = builder.bubble_info;
        this.rumor_source_img = builder.rumor_source_img;
        this.festival_tip_data = builder.festival_tip_data;
        this.novel_recom_card = builder.novel_recom_card;
        this.shield_icon = builder.shield_icon;
        this.icon_url = builder.icon_url;
        this.toutiao_card_tag = builder.toutiao_card_tag;
        this.toutiao_card_tag_color = builder.toutiao_card_tag_color;
        this.call_robot_entrance = builder.call_robot_entrance;
        this.is_bot_reply = builder.is_bot_reply;
        this.bot_reply_content = builder.bot_reply_content;
        this.bot_reply_content_list = Message.immutableCopyOf(builder.bot_reply_content_list);
        this.robot_skill = Message.immutableCopyOf(builder.robot_skill);
        this.aigc_feedback_info = builder.aigc_feedback_info;
        this.chat_content = builder.chat_content;
        this.sprite_meme_info = builder.sprite_meme_info;
        this.aichat_bot_comment_card = builder.aichat_bot_comment_card;
        this.log_param = Message.immutableCopyOf(builder.log_param);
        this.stamp_info = builder.stamp_info;
        this.head_extra_info = Message.immutableCopyOf(builder.head_extra_info);
        this.pic_content = Message.immutableCopyOf(builder.pic_content);
        this.no_pic_content = Message.immutableCopyOf(builder.no_pic_content);
        this.tail_style = builder.tail_style;
        this.ios_b_url = builder.ios_b_url;
        this.special_post = builder.special_post;
        this.footer = builder.footer;
        this.bdt_search_info = builder.bdt_search_info;
        this.bdt_user_adopt = builder.bdt_user_adopt;
        this.tmoney = builder.tmoney;
    }
}