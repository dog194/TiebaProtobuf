package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.FrsBottomActivity;

/* loaded from: classes4.dex */
public final class FrsPageCardData extends Message {

    @ProtoField(tag = 4)
    public final AiChatroomGuide ai_chatroom_guide;

    @ProtoField(tag = 5)
    public final FrsBottomActivity frs_activity;

    @ProtoField(tag = 6)
    public final FrsBannerHeader frs_banner_header;

    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<LiveFuseForumData> live_fuse_forum;

    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<LiveModuleList> live_module_list;

    @ProtoField(tag = 2)
    public final TopLiveData top_live_data;
    public static final List<LiveModuleList> DEFAULT_LIVE_MODULE_LIST = Collections.emptyList();
    public static final List<LiveFuseForumData> DEFAULT_LIVE_FUSE_FORUM = Collections.emptyList();

    public static final class Builder extends Message.Builder<FrsPageCardData> {
        public AiChatroomGuide ai_chatroom_guide;
        public FrsBottomActivity frs_activity;
        public FrsBannerHeader frs_banner_header;
        public List<LiveFuseForumData> live_fuse_forum;
        public List<LiveModuleList> live_module_list;
        public TopLiveData top_live_data;

        public Builder() {
        }

        public Builder(FrsPageCardData frsPageCardData) {
            super(frsPageCardData);
            if (frsPageCardData == null) {
                return;
            }
            this.live_module_list = Message.copyOf(frsPageCardData.live_module_list);
            this.top_live_data = frsPageCardData.top_live_data;
            this.live_fuse_forum = Message.copyOf(frsPageCardData.live_fuse_forum);
            this.ai_chatroom_guide = frsPageCardData.ai_chatroom_guide;
            this.frs_activity = frsPageCardData.frs_activity;
            this.frs_banner_header = frsPageCardData.frs_banner_header;
        }

        @Override // com.squareup.wire.Message.Builder
        public FrsPageCardData build(boolean z) {
            return new FrsPageCardData(this, z);
        }
    }

    public FrsPageCardData(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<LiveModuleList> list = builder.live_module_list;
            if (list == null) {
                this.live_module_list = DEFAULT_LIVE_MODULE_LIST;
            } else {
                this.live_module_list = Message.immutableCopyOf(list);
            }
            this.top_live_data = builder.top_live_data;
            List<LiveFuseForumData> list2 = builder.live_fuse_forum;
            if (list2 == null) {
                this.live_fuse_forum = DEFAULT_LIVE_FUSE_FORUM;
            } else {
                this.live_fuse_forum = Message.immutableCopyOf(list2);
            }
            this.ai_chatroom_guide = builder.ai_chatroom_guide;
            this.frs_activity = builder.frs_activity;
            this.frs_banner_header = builder.frs_banner_header;
            return;
        }
        this.live_module_list = Message.immutableCopyOf(builder.live_module_list);
        this.top_live_data = builder.top_live_data;
        this.live_fuse_forum = Message.immutableCopyOf(builder.live_fuse_forum);
        this.ai_chatroom_guide = builder.ai_chatroom_guide;
        this.frs_activity = builder.frs_activity;
        this.frs_banner_header = builder.frs_banner_header;
    }
}