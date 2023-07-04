import React from 'react';
import type { SvgIconProps } from '@mui/material/SvgIcon';
import AppSvgIcon from 'components/shared/icons/AppSvgIcon';
import styled from 'styled-components';
import type { Theme } from '@mui/material';

const styles = ({ theme }: { theme?: Theme }) => ({
  color: theme?.palette.texts.info,
  display: 'flex',
  '&:hover': { color: theme?.palette.texts.secondary },
});

const QuestionIcon: React.FC<SvgIconProps> = React.forwardRef(({ sx, ...props }, ref) => (
  <AppSvgIcon ref={ref} sx={sx} viewBox='0 0 16 16' {...props}>
    <svg
      width='16'
      height='16'
      viewBox='0 0 16 16'
      fill='none'
      xmlns='http://www.w3.org/2000/svg'
    >
      <path
        fillRule='evenodd'
        clipRule='evenodd'
        d='M16 8C16 12.4183 12.4183 16 8 16C3.58172 16 0 12.4183 0 8C0 3.58172 3.58172 0 8 0C12.4183 0 16 3.58172 16 8ZM8.74094 9.36806C8.65978 9.72413 8.37762 10.0222 8.01242 10.0222H7.74942C7.38123 10.0222 7.07667 9.72291 7.11224 9.35645C7.12419 9.23339 7.13976 9.11749 7.15897 9.00875C7.21368 8.7167 7.30357 8.45516 7.42864 8.22413C7.5537 7.98875 7.72176 7.76426 7.93281 7.55067C8.11649 7.37195 8.27673 7.20413 8.41352 7.0472C8.55031 6.88592 8.65584 6.72028 8.73009 6.55028C8.80435 6.38028 8.84148 6.19502 8.84148 5.99451C8.84148 5.75476 8.80826 5.55861 8.74182 5.40604C8.67929 5.24912 8.58549 5.13143 8.46042 5.05297C8.33927 4.97014 8.18684 4.92873 8.00315 4.92873C7.85073 4.92873 7.70808 4.96797 7.5752 5.04643C7.44232 5.12053 7.33484 5.23822 7.25276 5.39951C7.08929 5.72074 6.83132 6.03374 6.47089 6.03374H5.95645C5.58336 6.03374 5.27363 5.72494 5.34304 5.35835C5.40499 5.03112 5.51004 4.74624 5.65819 4.50373C5.9005 4.10271 6.22489 3.80847 6.63135 3.62104C7.04172 3.42924 7.49899 3.33334 8.00315 3.33334C8.56204 3.33334 9.0408 3.43142 9.43945 3.62758C9.842 3.82373 10.1488 4.1136 10.3598 4.49719C10.5748 4.88079 10.6823 5.34938 10.6823 5.90297C10.6823 6.2822 10.6178 6.61566 10.4888 6.90336C10.3598 7.18669 10.1879 7.45259 9.97293 7.70105C9.75797 7.94516 9.51957 8.20016 9.25771 8.46606C9.03494 8.68837 8.88252 8.91939 8.80044 9.15914C8.77758 9.22472 8.75774 9.29436 8.74094 9.36806ZM6.87171 12.023C6.87171 11.7309 6.96551 11.4847 7.1531 11.2841C7.34461 11.0836 7.59278 10.9834 7.89763 10.9834C8.20248 10.9834 8.4487 11.0836 8.6363 11.2841C8.82389 11.4847 8.91769 11.7309 8.91769 12.023C8.91769 12.3194 8.82389 12.5679 8.6363 12.7684C8.4487 12.9645 8.20248 13.0626 7.89763 13.0626C7.59278 13.0626 7.34461 12.9645 7.1531 12.7684C6.96551 12.5679 6.87171 12.3194 6.87171 12.023Z'
        fill='currentColor'
      />
    </svg>
  </AppSvgIcon>
));

export default styled(QuestionIcon)(styles);
