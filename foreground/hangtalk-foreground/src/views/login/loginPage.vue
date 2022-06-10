<template>
    <div class="login-frame">
        <div class="login-input">
            <AInput></AInput>
        </div>
    </div>
</template>
<script lang="ts">
import { Input } from 'ant-design-vue';

export default (
    name: 'LoginPage',
    components: {
        AInput: Input,
    },
    props: {

    },
    setup: (props) => {
        return {}
    },
)
</script>