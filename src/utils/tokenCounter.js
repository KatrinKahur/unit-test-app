import { encode } from 'gpt-tokenizer';

/**
 * This function counts the number of tokens in a text
 * @param text the specified text where the tokens need to be counted
 * @returns {number} the number of tokens
 */
export function countTokens(text) {
    return encode(text).length;
}
