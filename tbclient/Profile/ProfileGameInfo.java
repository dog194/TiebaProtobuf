package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.FeedKV;
import tbclient.MiniGame;

/* loaded from: classes4.dex */
public final class ProfileGameInfo extends Message {

    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<Game> banner;

    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<Game> game;

    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<FeedKV> log_param;

    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<MiniGame> mini_game;

    @ProtoField(tag = 5)
    public final Link module_link;
    public static final List<Game> DEFAULT_GAME = Collections.emptyList();
    public static final List<FeedKV> DEFAULT_LOG_PARAM = Collections.emptyList();
    public static final List<Game> DEFAULT_BANNER = Collections.emptyList();
    public static final List<MiniGame> DEFAULT_MINI_GAME = Collections.emptyList();

    public static final class Builder extends Message.Builder<ProfileGameInfo> {
        public List<Game> banner;
        public List<Game> game;
        public List<FeedKV> log_param;
        public List<MiniGame> mini_game;
        public Link module_link;

        public Builder() {
        }

        public Builder(ProfileGameInfo profileGameInfo) {
            super(profileGameInfo);
            if (profileGameInfo == null) {
                return;
            }
            this.game = Message.copyOf(profileGameInfo.game);
            this.log_param = Message.copyOf(profileGameInfo.log_param);
            this.banner = Message.copyOf(profileGameInfo.banner);
            this.mini_game = Message.copyOf(profileGameInfo.mini_game);
            this.module_link = profileGameInfo.module_link;
        }

        @Override // com.squareup.wire.Message.Builder
        public ProfileGameInfo build(boolean z) {
            return new ProfileGameInfo(this, z);
        }
    }

    public ProfileGameInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<Game> list = builder.game;
            if (list == null) {
                this.game = DEFAULT_GAME;
            } else {
                this.game = Message.immutableCopyOf(list);
            }
            List<FeedKV> list2 = builder.log_param;
            if (list2 == null) {
                this.log_param = DEFAULT_LOG_PARAM;
            } else {
                this.log_param = Message.immutableCopyOf(list2);
            }
            List<Game> list3 = builder.banner;
            if (list3 == null) {
                this.banner = DEFAULT_BANNER;
            } else {
                this.banner = Message.immutableCopyOf(list3);
            }
            List<MiniGame> list4 = builder.mini_game;
            if (list4 == null) {
                this.mini_game = DEFAULT_MINI_GAME;
            } else {
                this.mini_game = Message.immutableCopyOf(list4);
            }
            this.module_link = builder.module_link;
            return;
        }
        this.game = Message.immutableCopyOf(builder.game);
        this.log_param = Message.immutableCopyOf(builder.log_param);
        this.banner = Message.immutableCopyOf(builder.banner);
        this.mini_game = Message.immutableCopyOf(builder.mini_game);
        this.module_link = builder.module_link;
    }
}