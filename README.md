# FFmpegBox

FFmpeg command line tool box for android

## Command API

```java
Command command = new CatGifCommand.Builder()
    .setVideoFile("/sdcard/明明就.mp4")
    .setGifFile("/sdcard/明明就.gif")
    .setStartTime(45)
    .setDuration(10)
    .setWidth(480)
    .setHeight(270)
    .build();

new FFmpegBox().execute(command);
```

## Supported Commands

* CatGifCommand
* ...
* coming soon

## Licence

MIT
