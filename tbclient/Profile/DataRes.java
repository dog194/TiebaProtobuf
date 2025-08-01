package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.AlaLiveInfo;
import tbclient.Anti;
import tbclient.BannerImage;
import tbclient.BubbleInfo;
import tbclient.CustomGrid;
import tbclient.DealWindow;
import tbclient.DynamicInfo;
import tbclient.FeedKV;
import tbclient.Feedback;
import tbclient.ForumDynamic;
import tbclient.GoodsWin;
import tbclient.Highlist;
import tbclient.HotUserRankEntry;
import tbclient.ModuleInfo;
import tbclient.NamoaixudEntry;
import tbclient.PostInfoList;
import tbclient.SmartApp;
import tbclient.TbBookrack;
import tbclient.ThreadInfo;
import tbclient.UcCard;
import tbclient.UcCardInfo;
import tbclient.User;
import tbclient.UserManChannelInfo;
import tbclient.UserMap;

/* loaded from: classes4.dex */
public final class DataRes extends Message {
    public static final String DEFAULT_BOT_UK = "";
    public static final String DEFAULT_MSG_BUTTON_TEXT = "";
    public static final String DEFAULT_UK = "";

    @ProtoField(tag = 16)
    public final AlaLiveInfo ala_live_info;

    @ProtoField(label = Message.Label.REPEATED, tag = 19)
    public final List<AlaLiveInfo> ala_live_record;

    @ProtoField(tag = 2)
    public final Anti anti_stat;

    @ProtoField(label = Message.Label.REPEATED, tag = 22)
    public final List<BannerImage> banner;

    @ProtoField(tag = 36)
    public final MemberBlockInfo block_info;

    @ProtoField(tag = 49, type = Message.Datatype.STRING)
    public final String bot_uk;

    @ProtoField(tag = 38)
    public final BubbleInfo bubble_info;

    @ProtoField(label = Message.Label.REPEATED, tag = 40)
    public final List<UcCardInfo> common_card;

    @ProtoField(label = Message.Label.REPEATED, tag = 13)
    public final List<ForumDynamic> concerned_forum_list;

    @ProtoField(label = Message.Label.REPEATED, tag = 41)
    public final List<CustomGrid> custom_grid;

    @ProtoField(label = Message.Label.REPEATED, tag = 12)
    public final List<DynamicInfo> dynamic_list;

    @ProtoField(tag = 10)
    public final Feedback feedback;

    @ProtoField(tag = 35)
    public final FinanceTab finance_tab;

    @ProtoField(tag = 26)
    public final GoodsWin goods_win;

    @ProtoField(tag = 7)
    public final Highlist highs;

    @ProtoField(tag = 29, type = Message.Datatype.INT32)
    public final Integer is_black_white;

    @ProtoField(label = Message.Label.REPEATED, tag = 43)
    public final List<KingkongPositionRow> kingkong_position;

    @ProtoField(label = Message.Label.REPEATED, tag = 47)
    public final List<FeedKV> log_param;

    @ProtoField(tag = 15)
    public final ModuleInfo module_info;

    @ProtoField(label = Message.Label.REPEATED, tag = 42)
    public final List<CustomGrid> more_grid;

    @ProtoField(tag = 45, type = Message.Datatype.STRING)
    public final String msg_button_text;

    @ProtoField(tag = 24)
    public final Namoaixud namoaixud;

    @ProtoField(tag = 37)
    public final NamoaixudEntry namoaixud_entry;

    @ProtoField(tag = 27)
    public final HotUserRankEntry new_god_rankinfo;

    @ProtoField(label = Message.Label.REPEATED, tag = 25)
    public final List<ThreadInfo> newest_dynamic_list;

    @ProtoField(tag = 17)
    public final NicknameInfo nickname_info;

    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<PostInfoList> post_list;

    @ProtoField(label = Message.Label.REPEATED, tag = 23)
    public final List<SmartApp> recom_naws_list;

    @ProtoField(tag = 3)
    public final TAInfo tainfo;

    @ProtoField(tag = 9)
    public final TbBookrack tbbookrack;

    @ProtoField(tag = 6)
    public final UcCard uc_card;

    @ProtoField(tag = 28, type = Message.Datatype.STRING)
    public final String uk;

    @ProtoField(label = Message.Label.REPEATED, tag = 20)
    public final List<UserMap> url_map;

    @ProtoField(tag = 1)
    public final User user;

    @ProtoField(tag = 48)
    public final AgentInfo user_agent_info;

    @ProtoField(tag = 14)
    public final UserAgreeInfo user_agree_info;

    @ProtoField(tag = 5)
    public final UserGodInfo user_god_info;

    @ProtoField(tag = 11)
    public final UserManChannelInfo video_channel_info;

    @ProtoField(tag = 39)
    public final VipBanner vip_banner;

    @ProtoField(tag = 8)
    public final DealWindow window;

    @ProtoField(tag = 34, type = Message.Datatype.UINT32)
    public final Integer work_tab_id;

    @ProtoField(label = Message.Label.REPEATED, tag = 46)
    public final List<ZoneInfo> zone_info;
    public static final List<PostInfoList> DEFAULT_POST_LIST = Collections.emptyList();
    public static final List<DynamicInfo> DEFAULT_DYNAMIC_LIST = Collections.emptyList();
    public static final List<ForumDynamic> DEFAULT_CONCERNED_FORUM_LIST = Collections.emptyList();
    public static final List<AlaLiveInfo> DEFAULT_ALA_LIVE_RECORD = Collections.emptyList();
    public static final List<UserMap> DEFAULT_URL_MAP = Collections.emptyList();
    public static final List<BannerImage> DEFAULT_BANNER = Collections.emptyList();
    public static final List<SmartApp> DEFAULT_RECOM_NAWS_LIST = Collections.emptyList();
    public static final List<ThreadInfo> DEFAULT_NEWEST_DYNAMIC_LIST = Collections.emptyList();
    public static final Integer DEFAULT_IS_BLACK_WHITE = 0;
    public static final Integer DEFAULT_WORK_TAB_ID = 0;
    public static final List<UcCardInfo> DEFAULT_COMMON_CARD = Collections.emptyList();
    public static final List<CustomGrid> DEFAULT_CUSTOM_GRID = Collections.emptyList();
    public static final List<CustomGrid> DEFAULT_MORE_GRID = Collections.emptyList();
    public static final List<KingkongPositionRow> DEFAULT_KINGKONG_POSITION = Collections.emptyList();
    public static final List<ZoneInfo> DEFAULT_ZONE_INFO = Collections.emptyList();
    public static final List<FeedKV> DEFAULT_LOG_PARAM = Collections.emptyList();

    public static final class Builder extends Message.Builder<DataRes> {
        public AlaLiveInfo ala_live_info;
        public List<AlaLiveInfo> ala_live_record;
        public Anti anti_stat;
        public List<BannerImage> banner;
        public MemberBlockInfo block_info;
        public String bot_uk;
        public BubbleInfo bubble_info;
        public List<UcCardInfo> common_card;
        public List<ForumDynamic> concerned_forum_list;
        public List<CustomGrid> custom_grid;
        public List<DynamicInfo> dynamic_list;
        public Feedback feedback;
        public FinanceTab finance_tab;
        public GoodsWin goods_win;
        public Highlist highs;
        public Integer is_black_white;
        public List<KingkongPositionRow> kingkong_position;
        public List<FeedKV> log_param;
        public ModuleInfo module_info;
        public List<CustomGrid> more_grid;
        public String msg_button_text;
        public Namoaixud namoaixud;
        public NamoaixudEntry namoaixud_entry;
        public HotUserRankEntry new_god_rankinfo;
        public List<ThreadInfo> newest_dynamic_list;
        public NicknameInfo nickname_info;
        public List<PostInfoList> post_list;
        public List<SmartApp> recom_naws_list;
        public TAInfo tainfo;
        public TbBookrack tbbookrack;
        public UcCard uc_card;
        public String uk;
        public List<UserMap> url_map;
        public User user;
        public AgentInfo user_agent_info;
        public UserAgreeInfo user_agree_info;
        public UserGodInfo user_god_info;
        public UserManChannelInfo video_channel_info;
        public VipBanner vip_banner;
        public DealWindow window;
        public Integer work_tab_id;
        public List<ZoneInfo> zone_info;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.user = dataRes.user;
            this.anti_stat = dataRes.anti_stat;
            this.tainfo = dataRes.tainfo;
            this.post_list = Message.copyOf(dataRes.post_list);
            this.user_god_info = dataRes.user_god_info;
            this.uc_card = dataRes.uc_card;
            this.highs = dataRes.highs;
            this.window = dataRes.window;
            this.tbbookrack = dataRes.tbbookrack;
            this.feedback = dataRes.feedback;
            this.video_channel_info = dataRes.video_channel_info;
            this.dynamic_list = Message.copyOf(dataRes.dynamic_list);
            this.concerned_forum_list = Message.copyOf(dataRes.concerned_forum_list);
            this.user_agree_info = dataRes.user_agree_info;
            this.module_info = dataRes.module_info;
            this.ala_live_info = dataRes.ala_live_info;
            this.nickname_info = dataRes.nickname_info;
            this.ala_live_record = Message.copyOf(dataRes.ala_live_record);
            this.url_map = Message.copyOf(dataRes.url_map);
            this.banner = Message.copyOf(dataRes.banner);
            this.recom_naws_list = Message.copyOf(dataRes.recom_naws_list);
            this.namoaixud = dataRes.namoaixud;
            this.newest_dynamic_list = Message.copyOf(dataRes.newest_dynamic_list);
            this.goods_win = dataRes.goods_win;
            this.new_god_rankinfo = dataRes.new_god_rankinfo;
            this.uk = dataRes.uk;
            this.is_black_white = dataRes.is_black_white;
            this.work_tab_id = dataRes.work_tab_id;
            this.finance_tab = dataRes.finance_tab;
            this.block_info = dataRes.block_info;
            this.namoaixud_entry = dataRes.namoaixud_entry;
            this.bubble_info = dataRes.bubble_info;
            this.vip_banner = dataRes.vip_banner;
            this.common_card = Message.copyOf(dataRes.common_card);
            this.custom_grid = Message.copyOf(dataRes.custom_grid);
            this.more_grid = Message.copyOf(dataRes.more_grid);
            this.kingkong_position = Message.copyOf(dataRes.kingkong_position);
            this.msg_button_text = dataRes.msg_button_text;
            this.zone_info = Message.copyOf(dataRes.zone_info);
            this.log_param = Message.copyOf(dataRes.log_param);
            this.user_agent_info = dataRes.user_agent_info;
            this.bot_uk = dataRes.bot_uk;
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
            this.anti_stat = builder.anti_stat;
            this.tainfo = builder.tainfo;
            List<PostInfoList> list = builder.post_list;
            if (list == null) {
                this.post_list = DEFAULT_POST_LIST;
            } else {
                this.post_list = Message.immutableCopyOf(list);
            }
            this.user_god_info = builder.user_god_info;
            this.uc_card = builder.uc_card;
            this.highs = builder.highs;
            this.window = builder.window;
            this.tbbookrack = builder.tbbookrack;
            this.feedback = builder.feedback;
            this.video_channel_info = builder.video_channel_info;
            List<DynamicInfo> list2 = builder.dynamic_list;
            if (list2 == null) {
                this.dynamic_list = DEFAULT_DYNAMIC_LIST;
            } else {
                this.dynamic_list = Message.immutableCopyOf(list2);
            }
            List<ForumDynamic> list3 = builder.concerned_forum_list;
            if (list3 == null) {
                this.concerned_forum_list = DEFAULT_CONCERNED_FORUM_LIST;
            } else {
                this.concerned_forum_list = Message.immutableCopyOf(list3);
            }
            this.user_agree_info = builder.user_agree_info;
            this.module_info = builder.module_info;
            this.ala_live_info = builder.ala_live_info;
            this.nickname_info = builder.nickname_info;
            List<AlaLiveInfo> list4 = builder.ala_live_record;
            if (list4 == null) {
                this.ala_live_record = DEFAULT_ALA_LIVE_RECORD;
            } else {
                this.ala_live_record = Message.immutableCopyOf(list4);
            }
            List<UserMap> list5 = builder.url_map;
            if (list5 == null) {
                this.url_map = DEFAULT_URL_MAP;
            } else {
                this.url_map = Message.immutableCopyOf(list5);
            }
            List<BannerImage> list6 = builder.banner;
            if (list6 == null) {
                this.banner = DEFAULT_BANNER;
            } else {
                this.banner = Message.immutableCopyOf(list6);
            }
            List<SmartApp> list7 = builder.recom_naws_list;
            if (list7 == null) {
                this.recom_naws_list = DEFAULT_RECOM_NAWS_LIST;
            } else {
                this.recom_naws_list = Message.immutableCopyOf(list7);
            }
            this.namoaixud = builder.namoaixud;
            List<ThreadInfo> list8 = builder.newest_dynamic_list;
            if (list8 == null) {
                this.newest_dynamic_list = DEFAULT_NEWEST_DYNAMIC_LIST;
            } else {
                this.newest_dynamic_list = Message.immutableCopyOf(list8);
            }
            this.goods_win = builder.goods_win;
            this.new_god_rankinfo = builder.new_god_rankinfo;
            String str = builder.uk;
            if (str == null) {
                this.uk = "";
            } else {
                this.uk = str;
            }
            Integer num = builder.is_black_white;
            if (num == null) {
                this.is_black_white = DEFAULT_IS_BLACK_WHITE;
            } else {
                this.is_black_white = num;
            }
            Integer num2 = builder.work_tab_id;
            if (num2 == null) {
                this.work_tab_id = DEFAULT_WORK_TAB_ID;
            } else {
                this.work_tab_id = num2;
            }
            this.finance_tab = builder.finance_tab;
            this.block_info = builder.block_info;
            this.namoaixud_entry = builder.namoaixud_entry;
            this.bubble_info = builder.bubble_info;
            this.vip_banner = builder.vip_banner;
            List<UcCardInfo> list9 = builder.common_card;
            if (list9 == null) {
                this.common_card = DEFAULT_COMMON_CARD;
            } else {
                this.common_card = Message.immutableCopyOf(list9);
            }
            List<CustomGrid> list10 = builder.custom_grid;
            if (list10 == null) {
                this.custom_grid = DEFAULT_CUSTOM_GRID;
            } else {
                this.custom_grid = Message.immutableCopyOf(list10);
            }
            List<CustomGrid> list11 = builder.more_grid;
            if (list11 == null) {
                this.more_grid = DEFAULT_MORE_GRID;
            } else {
                this.more_grid = Message.immutableCopyOf(list11);
            }
            List<KingkongPositionRow> list12 = builder.kingkong_position;
            if (list12 == null) {
                this.kingkong_position = DEFAULT_KINGKONG_POSITION;
            } else {
                this.kingkong_position = Message.immutableCopyOf(list12);
            }
            String str2 = builder.msg_button_text;
            if (str2 == null) {
                this.msg_button_text = "";
            } else {
                this.msg_button_text = str2;
            }
            List<ZoneInfo> list13 = builder.zone_info;
            if (list13 == null) {
                this.zone_info = DEFAULT_ZONE_INFO;
            } else {
                this.zone_info = Message.immutableCopyOf(list13);
            }
            List<FeedKV> list14 = builder.log_param;
            if (list14 == null) {
                this.log_param = DEFAULT_LOG_PARAM;
            } else {
                this.log_param = Message.immutableCopyOf(list14);
            }
            this.user_agent_info = builder.user_agent_info;
            String str3 = builder.bot_uk;
            if (str3 == null) {
                this.bot_uk = "";
                return;
            } else {
                this.bot_uk = str3;
                return;
            }
        }
        this.user = builder.user;
        this.anti_stat = builder.anti_stat;
        this.tainfo = builder.tainfo;
        this.post_list = Message.immutableCopyOf(builder.post_list);
        this.user_god_info = builder.user_god_info;
        this.uc_card = builder.uc_card;
        this.highs = builder.highs;
        this.window = builder.window;
        this.tbbookrack = builder.tbbookrack;
        this.feedback = builder.feedback;
        this.video_channel_info = builder.video_channel_info;
        this.dynamic_list = Message.immutableCopyOf(builder.dynamic_list);
        this.concerned_forum_list = Message.immutableCopyOf(builder.concerned_forum_list);
        this.user_agree_info = builder.user_agree_info;
        this.module_info = builder.module_info;
        this.ala_live_info = builder.ala_live_info;
        this.nickname_info = builder.nickname_info;
        this.ala_live_record = Message.immutableCopyOf(builder.ala_live_record);
        this.url_map = Message.immutableCopyOf(builder.url_map);
        this.banner = Message.immutableCopyOf(builder.banner);
        this.recom_naws_list = Message.immutableCopyOf(builder.recom_naws_list);
        this.namoaixud = builder.namoaixud;
        this.newest_dynamic_list = Message.immutableCopyOf(builder.newest_dynamic_list);
        this.goods_win = builder.goods_win;
        this.new_god_rankinfo = builder.new_god_rankinfo;
        this.uk = builder.uk;
        this.is_black_white = builder.is_black_white;
        this.work_tab_id = builder.work_tab_id;
        this.finance_tab = builder.finance_tab;
        this.block_info = builder.block_info;
        this.namoaixud_entry = builder.namoaixud_entry;
        this.bubble_info = builder.bubble_info;
        this.vip_banner = builder.vip_banner;
        this.common_card = Message.immutableCopyOf(builder.common_card);
        this.custom_grid = Message.immutableCopyOf(builder.custom_grid);
        this.more_grid = Message.immutableCopyOf(builder.more_grid);
        this.kingkong_position = Message.immutableCopyOf(builder.kingkong_position);
        this.msg_button_text = builder.msg_button_text;
        this.zone_info = Message.immutableCopyOf(builder.zone_info);
        this.log_param = Message.immutableCopyOf(builder.log_param);
        this.user_agent_info = builder.user_agent_info;
        this.bot_uk = builder.bot_uk;
    }
}