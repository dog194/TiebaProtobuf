package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class RecomForumCard extends Message {
    public static final String DEFAULT_TITLE = "";

    @ProtoField(tag = 3)
    public final ThemeColorInfo avatar;

    @ProtoField(label = Message.Label.REPEATED, tag = 9)
    public final List<FeedKV> business_info;

    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer card_offset;

    @ProtoField(label = Message.Label.REPEATED, tag = 6)
    public final List<RecommendForumInfo> forum_list;

    @ProtoField(tag = 5)
    public final PubCardFreq freq;

    @ProtoField(tag = 8, type = Message.Datatype.BOOL)
    public final Boolean is_hit_new_style;

    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer screen_max_num;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;
    public static final Integer DEFAULT_CARD_OFFSET = 0;
    public static final List<RecommendForumInfo> DEFAULT_FORUM_LIST = Collections.emptyList();
    public static final Integer DEFAULT_SCREEN_MAX_NUM = 0;
    public static final Boolean DEFAULT_IS_HIT_NEW_STYLE = Boolean.FALSE;
    public static final List<FeedKV> DEFAULT_BUSINESS_INFO = Collections.emptyList();

    public static final class Builder extends Message.Builder<RecomForumCard> {
        public ThemeColorInfo avatar;
        public List<FeedKV> business_info;
        public Integer card_offset;
        public List<RecommendForumInfo> forum_list;
        public PubCardFreq freq;
        public Boolean is_hit_new_style;
        public Integer screen_max_num;
        public String title;

        public Builder() {
        }

        public Builder(RecomForumCard recomForumCard) {
            super(recomForumCard);
            if (recomForumCard == null) {
                return;
            }
            this.title = recomForumCard.title;
            this.avatar = recomForumCard.avatar;
            this.card_offset = recomForumCard.card_offset;
            this.freq = recomForumCard.freq;
            this.forum_list = Message.copyOf(recomForumCard.forum_list);
            this.screen_max_num = recomForumCard.screen_max_num;
            this.is_hit_new_style = recomForumCard.is_hit_new_style;
            this.business_info = Message.copyOf(recomForumCard.business_info);
        }

        @Override // com.squareup.wire.Message.Builder
        public RecomForumCard build(boolean z) {
            return new RecomForumCard(this, z);
        }
    }

    public RecomForumCard(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            this.avatar = builder.avatar;
            Integer num = builder.card_offset;
            if (num == null) {
                this.card_offset = DEFAULT_CARD_OFFSET;
            } else {
                this.card_offset = num;
            }
            this.freq = builder.freq;
            List<RecommendForumInfo> list = builder.forum_list;
            if (list == null) {
                this.forum_list = DEFAULT_FORUM_LIST;
            } else {
                this.forum_list = Message.immutableCopyOf(list);
            }
            Integer num2 = builder.screen_max_num;
            if (num2 == null) {
                this.screen_max_num = DEFAULT_SCREEN_MAX_NUM;
            } else {
                this.screen_max_num = num2;
            }
            Boolean bool = builder.is_hit_new_style;
            if (bool == null) {
                this.is_hit_new_style = DEFAULT_IS_HIT_NEW_STYLE;
            } else {
                this.is_hit_new_style = bool;
            }
            List<FeedKV> list2 = builder.business_info;
            if (list2 == null) {
                this.business_info = DEFAULT_BUSINESS_INFO;
                return;
            } else {
                this.business_info = Message.immutableCopyOf(list2);
                return;
            }
        }
        this.title = builder.title;
        this.avatar = builder.avatar;
        this.card_offset = builder.card_offset;
        this.freq = builder.freq;
        this.forum_list = Message.immutableCopyOf(builder.forum_list);
        this.screen_max_num = builder.screen_max_num;
        this.is_hit_new_style = builder.is_hit_new_style;
        this.business_info = Message.immutableCopyOf(builder.business_info);
    }
}