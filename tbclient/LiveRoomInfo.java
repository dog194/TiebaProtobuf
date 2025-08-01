package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class LiveRoomInfo extends Message {
    public static final String DEFAULT_BTN_TITLE = "";
    public static final String DEFAULT_JUMP_URL = "";
    public static final Integer DEFAULT_OWN_ROOM_COUNT = 0;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String btn_title;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String jump_url;

    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer own_room_count;

    public static final class Builder extends Message.Builder<LiveRoomInfo> {
        public String btn_title;
        public String jump_url;
        public Integer own_room_count;

        public Builder() {
        }

        public Builder(LiveRoomInfo liveRoomInfo) {
            super(liveRoomInfo);
            if (liveRoomInfo == null) {
                return;
            }
            this.btn_title = liveRoomInfo.btn_title;
            this.own_room_count = liveRoomInfo.own_room_count;
            this.jump_url = liveRoomInfo.jump_url;
        }

        @Override // com.squareup.wire.Message.Builder
        public LiveRoomInfo build(boolean z) {
            return new LiveRoomInfo(this, z);
        }
    }

    public LiveRoomInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.btn_title;
            if (str == null) {
                this.btn_title = "";
            } else {
                this.btn_title = str;
            }
            Integer num = builder.own_room_count;
            if (num == null) {
                this.own_room_count = DEFAULT_OWN_ROOM_COUNT;
            } else {
                this.own_room_count = num;
            }
            String str2 = builder.jump_url;
            if (str2 == null) {
                this.jump_url = "";
                return;
            } else {
                this.jump_url = str2;
                return;
            }
        }
        this.btn_title = builder.btn_title;
        this.own_room_count = builder.own_room_count;
        this.jump_url = builder.jump_url;
    }
}