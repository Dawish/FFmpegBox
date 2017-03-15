package cn.gavinliu.android.ffmpeg.box;

import android.text.TextUtils;

import cn.gavinliu.android.ffmpeg.box.commands.Command;

/**
 * FFmpeg Tool box
 * <p>
 * Created by Gavin on 17-3-6.
 */

public class FFmpegBox {

    private static final String CMD_CAT_GIF = "ffmpeg -ss %d -t %d -i %s -s %d*%d -f gif %s";

    public void execute(Command command) {
        if (command == null || TextUtils.isEmpty(command.getCommand())) return;

        String[] commands = command.getCommand().split(" ");
        execute(commands);
    }

    public native String urlProtocolInfo();

    public native String avCodecInfo();

    public native String avFilterInfo();

    public native String avFormatInfo();

    private native int execute(String[] commonds);

    static {
        System.loadLibrary("ffmpeg_box");
        System.loadLibrary("ffmpeg");
    }

}
