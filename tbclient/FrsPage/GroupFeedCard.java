package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class GroupFeedCard extends Message {
    public static final String DEFAULT_CARD_TITLE = "";
    public static final String DEFAULT_TOPBAR_ICON = "";
    public static final String DEFAULT_TOPBAR_ICON_DARK = "";
    public static final String DEFAULT_TOPBAR_TITLE = "";

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String card_title;

    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<FeedGroupInfo> group_list;

    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer index;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String topbar_icon;

    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String topbar_icon_dark;

    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String topbar_title;
    public static final Integer DEFAULT_INDEX = 0;
    public static final List<FeedGroupInfo> DEFAULT_GROUP_LIST = Collections.emptyList();

    public static final class Builder extends Message.Builder<GroupFeedCard> {
        public String card_title;
        public List<FeedGroupInfo> group_list;
        public Integer index;
        public String topbar_icon;
        public String topbar_icon_dark;
        public String topbar_title;

        public Builder() {
        }

        public Builder(GroupFeedCard groupFeedCard) {
            super(groupFeedCard);
            if (groupFeedCard == null) {
                return;
            }
            this.card_title = groupFeedCard.card_title;
            this.index = groupFeedCard.index;
            this.group_list = Message.copyOf(groupFeedCard.group_list);
            this.topbar_icon = groupFeedCard.topbar_icon;
            this.topbar_title = groupFeedCard.topbar_title;
            this.topbar_icon_dark = groupFeedCard.topbar_icon_dark;
        }

        @Override // com.squareup.wire.Message.Builder
        public GroupFeedCard build(boolean z) {
            return new GroupFeedCard(this, z);
        }
    }

    public GroupFeedCard(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.card_title;
            if (str == null) {
                this.card_title = "";
            } else {
                this.card_title = str;
            }
            Integer num = builder.index;
            if (num == null) {
                this.index = DEFAULT_INDEX;
            } else {
                this.index = num;
            }
            List<FeedGroupInfo> list = builder.group_list;
            if (list == null) {
                this.group_list = DEFAULT_GROUP_LIST;
            } else {
                this.group_list = Message.immutableCopyOf(list);
            }
            String str2 = builder.topbar_icon;
            if (str2 == null) {
                this.topbar_icon = "";
            } else {
                this.topbar_icon = str2;
            }
            String str3 = builder.topbar_title;
            if (str3 == null) {
                this.topbar_title = "";
            } else {
                this.topbar_title = str3;
            }
            String str4 = builder.topbar_icon_dark;
            if (str4 == null) {
                this.topbar_icon_dark = "";
                return;
            } else {
                this.topbar_icon_dark = str4;
                return;
            }
        }
        this.card_title = builder.card_title;
        this.index = builder.index;
        this.group_list = Message.immutableCopyOf(builder.group_list);
        this.topbar_icon = builder.topbar_icon;
        this.topbar_title = builder.topbar_title;
        this.topbar_icon_dark = builder.topbar_icon_dark;
    }
}