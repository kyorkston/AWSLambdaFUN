'use strict';

console.log('Loading function');

exports.handler = (event, context, callback) => {
    console.log('Received event:', JSON.stringify(event, null, 2));

    callback(null, event.key1);  // Echo back the first key value
    //callback('Something went wrong');
};
