<template>
    <div class="login-frame">
        <video class="bgVideo" autoplay="autoplay" loop="loop" muted="muted" controls>
            <source src="../../static/1648280312588.mp4" type="video/mp4">
        </video>
        <div class="login-input">
            <text />
        </div>
    </div>
</template>
<script lang="ts">
import { Input as AInput } from 'ant-design-vue';

export default {
    name: 'LoginPage',
    components: {
        AInput
    }
}
</script>
<style lang="less" scoped>
.login-frame {
    .login-input {
        height: 200px;
        width: 600px;
        background-color: aliceblue;
    }
}
.bgVideo {
    width: 100%;
    height: 100%;
    object-fit: cover;
    position: absolute;
    top: 0;
    left: 0;
}
video::-webkit-media-controls-fullscreen-button {
    display: none;
}

video::-webkit-media-controls-play-button {
    display: none;
}

video::-webkit-media-controls-timeline {
    display: none;
}

video::-webkit-media-controls-current-time-display {
    display: none;
}

video::-webkit-media-controls-time-remaining-display {
    display: none;
}

video::-webkit-media-controls-mute-button {
    display: none;
}

video::-webkit-media-controls-toggle-closed-captions-button {
    display: none;
}

video::-webkit-media-controls-enclosure {
    display: none;
}

video::-webkit-media-controls-volume-slider {
    display: none;
}

</style>
