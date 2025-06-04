# TimePiece Plugin

## [让我们说中文！](https://github.com/superwfox/TimePiece/blob/master/README_zh.markdown)

## Overview
TimePiece is a lightweight Minecraft plugin designed for builders. It extends the daytime duration to 20 minutes while keeping the nighttime at its default length of 10 minutes. This allows players to have more time to build in daylight, enhancing the building experience on servers with a normal world environment.

## Features
- Extends daytime to 20 minutes in normal worlds.
- Keeps nighttime at the default 10 minutes.
- Disables the default day-night cycle (`doDaylightCycle` set to `false`).
- Automatically applies to all normal worlds on the server.

## Installation
1. Download the latest version of the TimePiece plugin JAR file.
2. Place the JAR file into the `plugins` folder of your Minecraft server.
3. Start or reload your server to enable the plugin.
   - The plugin will automatically detect all normal worlds and apply the custom time flow.

## Usage
- The plugin activates automatically when the server starts (via `onEnable`).
- Daytime in normal worlds will last 20 minutes, while nighttime lasts 10 minutes.
- No additional commands or configuration are required.

## Notes
- This plugin is designed for servers running Bukkit, Spigot, or Paper.
- Only worlds with the `NORMAL` environment are affected.
- Ensure there are no conflicting plugins that modify the day-night cycle.

## License
This plugin is distributed under the MIT License. Feel free to modify and redistribute it as needed.
