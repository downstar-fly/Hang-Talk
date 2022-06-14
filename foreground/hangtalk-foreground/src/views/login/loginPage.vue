<template>
    <div class="login-frame">
        <video class="bgVideo" autoplay loop muted>
            <source src="../../static/1648280312588.mp4" type="video/mp4">
        </video>
        <div class="main-area">
            <div class="main-title">{{ title }}</div>
            <div class="login-content">
                <div class="login-username">
                    <a-input
                        default-value="your ID"
                        :value="account"
                        :maxlength="20"
                        :allow-clear="true"
                        @change="onAccountChange"
                    >
                        <template #prefix>
                            <user-outlined class="user-icon" />
                        </template>
                    </a-input>
                    <div class="border-btm" />
                </div>
                <div class="login-password">
                    <a-input
                        default-value="your password"
                        :value="password"
                        type="password"
                        :allow-clear="true"
                        @change="onPasswordChange"
                    >
                        <template #prefix>
                            <lock-outlined class="lock-outlined" />
                        </template>
                    </a-input>
                    <div class="border-btm" />
                </div>
                <div class="action-change">
                    <span>
                        还没有账号？
                        <a class="a-tag" @click="toRegisterPage">注册</a>
                    </span>
                    <span>
                        <a class="a-tag" @click="toResetPassword">忘记密码？</a>
                    </span>
                </div>
            </div>
        </div>
    </div>
</template>
<script lang="ts">
import { Input as AInput } from 'ant-design-vue';
import { UserOutlined, LockOutlined } from '@ant-design/icons-vue';
import { ref } from 'vue';

export default {
    name: 'LoginPage',
    components: {
        AInput,
        UserOutlined,
        LockOutlined,
    },
    // data() {
    //     return {
    //         title: '登录',
    //         account: '',
    //         password: '',
    //     }
    // },
    setup() {
        const title: string = '登录';
        const account = ref('');
        const password = ref('');

        const onAccountChange = (e) => {
            if (e.data) {
                account.value += e.data;
            } else {
                account.value = '';
            }
        }

        const onPasswordChange = (e) => {
            if (e.data) {
                password.value += e.data;
            } else {
                password.value = '';
            }
        }

        return {
            title,
            account,
            password,
            onPasswordChange,
            onAccountChange,
        }
    },

    methods: {
        toRegisterPage() {
            console.log('注册');
        },

        toResetPassword() {
            console.log('重置密码');
        }
    }
}
</script>
<style lang="less" scoped>
 video{
    position: fixed;
    right: 0px;
    bottom: 0px;
    min-width: 100%;
    min-height: 100%;
    height: auto;
    width: auto;
    /*加滤镜*/
    /*filter: blur(15px); //背景模糊设置 */
    /*-webkit-filter: grayscale(100%);*/
    /*filter:grayscale(100%); //背景灰度设置*/
    z-index:-11
}
source{
    min-width: 100%;
    min-height: 100%;
    height: auto;
    width: auto
}
.border-btm {
    border-bottom: 1px solid;
    width: 80%;
}
.a-tag {
    cursor: pointer;
    color: rgb(107, 167, 227);
}
.login-frame {
    .main-title {
        font-size: 24px;
        color: #000;
    }
    .main-area {
        position: absolute;
        top: 25%;
        left: 25%;
        height: 260px;
        width: 600px;
        background-color: rgba(255,255,255,0.5);
        opacity: 0.75;
        padding: 20px 10px 0px;

        .login-content {
            .action-change {
                display: flex;
                align-items: center;
                justify-content: space-between;
                padding: 0px 15%;
                margin-top: 25px;
            }

            .login-username {
                text-align: left;
                margin-top: 20px;
                padding-left: 15%;
                height: 35px;

                /deep/ .user-icon svg {
                    height: 25px;
                    width: 25px;
                }
                /deep/ .ant-input {
                    width: 80%;
                    height: 29px;
                    background-color: transparent;
                    border: none;
                    margin-left: 20px;
                    outline: none;
                }
            }
            .login-password {
                text-align: left;
                margin-top: 35px;
                padding-left: 15%;
                height: 35px;

                /deep/ .lock-outlined svg {
                    height: 25px;
                    width: 25px;
                }
                /deep/ .ant-input {
                    width: 80%;
                    height: 29px;
                    background-color: transparent;
                    border: none;
                    margin-left: 20px;
                    outline: none;
                }
            }
        }
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
