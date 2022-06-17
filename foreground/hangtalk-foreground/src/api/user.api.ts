import request from 'umi-request';

export function registerUser (data) {
    return request.post('v1/user/register', {
        data: data,
    });
}