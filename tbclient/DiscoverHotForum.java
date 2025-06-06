package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class DiscoverHotForum extends Message {
    public static final String DEFAULT_SHOW_FREQUENCY = "";

    @ProtoField(label = Message.Label.REPEATED, tag = 6)
    public final List<FeedKV> business_info;

    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer floor;

    @ProtoField(tag = 5, type = Message.Datatype.BOOL)
    public final Boolean is_hit_new_style;

    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer screen_max_num;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String show_frequency;

    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<DiscoverTabCard> tab_list;
    public static final List<DiscoverTabCard> DEFAULT_TAB_LIST = Collections.emptyList();
    public static final Integer DEFAULT_FLOOR = 0;
    public static final Integer DEFAULT_SCREEN_MAX_NUM = 0;
    public static final Boolean DEFAULT_IS_HIT_NEW_STYLE = Boolean.FALSE;
    public static final List<FeedKV> DEFAULT_BUSINESS_INFO = Collections.emptyList();

    public static final class Builder extends Message.Builder<DiscoverHotForum> {
        public List<FeedKV> business_info;
        public Integer floor;
        public Boolean is_hit_new_style;
        public Integer screen_max_num;
        public String show_frequency;
        public List<DiscoverTabCard> tab_list;

        public Builder() {
        }

        public Builder(DiscoverHotForum discoverHotForum) {
            super(discoverHotForum);
            if (discoverHotForum == null) {
                return;
            }
            this.tab_list = Message.copyOf(discoverHotForum.tab_list);
            this.floor = discoverHotForum.floor;
            this.screen_max_num = discoverHotForum.screen_max_num;
            this.show_frequency = discoverHotForum.show_frequency;
            this.is_hit_new_style = discoverHotForum.is_hit_new_style;
            this.business_info = Message.copyOf(discoverHotForum.business_info);
        }

        @Override // com.squareup.wire.Message.Builder
        public DiscoverHotForum build(boolean z) {
            return new DiscoverHotForum(this, z);
        }
    }

    public DiscoverHotForum(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<DiscoverTabCard> list = builder.tab_list;
            if (list == null) {
                this.tab_list = DEFAULT_TAB_LIST;
            } else {
                this.tab_list = Message.immutableCopyOf(list);
            }
            Integer num = builder.floor;
            if (num == null) {
                this.floor = DEFAULT_FLOOR;
            } else {
                this.floor = num;
            }
            Integer num2 = builder.screen_max_num;
            if (num2 == null) {
                this.screen_max_num = DEFAULT_SCREEN_MAX_NUM;
            } else {
                this.screen_max_num = num2;
            }
            String str = builder.show_frequency;
            if (str == null) {
                this.show_frequency = "";
            } else {
                this.show_frequency = str;
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
        this.tab_list = Message.immutableCopyOf(builder.tab_list);
        this.floor = builder.floor;
        this.screen_max_num = builder.screen_max_num;
        this.show_frequency = builder.show_frequency;
        this.is_hit_new_style = builder.is_hit_new_style;
        this.business_info = Message.immutableCopyOf(builder.business_info);
    }
}