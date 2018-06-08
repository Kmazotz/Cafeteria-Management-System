using System;
using System.ComponentModel;
using System.Drawing;
using System.Windows.Forms;

namespace ControlsDesigner.Panels
{
    public partial class TitleBarPanel : Panel
    {
        public Image BarIcon { get => IconBox.Image; set => IconBox.Image = value; }

        public Image MinimizeIcon { get => MinimizeButton.Image; set => MinimizeButton.Image = value; }

        public Image MaximizeIcon { get => MaximizeButton.Image; set => MaximizeButton.Image = value; }

        public Image CloseIcon { get => CloseButton.Image; set => CloseButton.Image = value; }

        public string TitleText { get => TitleLabel.Text; set => TitleLabel.Text = value; }

        public Font TitleFont { get => TitleLabel.Font; set => TitleLabel.Font = value; }

        //public Button[] BarButtons => new[] { MinimizeButton, MaximizeButton, CloseButton };

        public TitleBarPanel()
        {
            InitializeComponent();
        }

        public void AddEvent(EventHandler _event, ButtonBar button)
        {
            switch (button)
            {
                case ButtonBar.Minimize:
                    MinimizeButton.Click += _event;
                    break;
                case ButtonBar.Maximize:
                    MaximizeButton.Click += _event;
                    break;
                case ButtonBar.Close:
                    CloseButton.Click += _event;
                    break;
            }

        }

        private void InitializeComponent()
        {
            this.IconBox = new System.Windows.Forms.PictureBox();
            this.MinimizeButton = new System.Windows.Forms.Button();
            this.CloseButton = new System.Windows.Forms.Button();
            this.MaximizeButton = new System.Windows.Forms.Button();
            this.TitleLabel = new System.Windows.Forms.Label();
            ((System.ComponentModel.ISupportInitialize)(this.IconBox)).BeginInit();
            this.SuspendLayout();
            // 
            // IconBox
            // 
            this.IconBox.Location = new System.Drawing.Point(6, 2);
            this.IconBox.Name = "IconBox";
            this.IconBox.Size = new System.Drawing.Size(20, 20);
            this.IconBox.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.IconBox.TabIndex = 0;
            this.IconBox.TabStop = false;
            // 
            // MinimizeButton
            // 
            //this.MinimizeButton.BackColor = System.Drawing.Color.Transparent;
            this.MinimizeButton.Dock = System.Windows.Forms.DockStyle.Right;
            this.MinimizeButton.FlatAppearance.BorderColor = System.Drawing.Color.Black;
            this.MinimizeButton.FlatAppearance.BorderSize = 0;
            this.MinimizeButton.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.MinimizeButton.ImageAlign = System.Drawing.ContentAlignment.BottomCenter;
            this.MinimizeButton.Location = new System.Drawing.Point(122, 0);
            this.MinimizeButton.Name = "MinimizeButton";
            this.MinimizeButton.Size = new System.Drawing.Size(26, 23);
            this.MinimizeButton.TabIndex = 2;
            this.MinimizeButton.TabStop = false;
            this.MinimizeButton.UseVisualStyleBackColor = true;
            // 
            // CloseButton
            // 
            //this.CloseButton.BackColor = System.Drawing.Color.Transparent;
            this.CloseButton.Dock = System.Windows.Forms.DockStyle.Right;
            this.CloseButton.FlatAppearance.BorderColor = System.Drawing.Color.Black;
            this.CloseButton.FlatAppearance.BorderSize = 0;
            this.CloseButton.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.CloseButton.Location = new System.Drawing.Point(174, 0);
            this.CloseButton.Name = "CloseButton";
            this.CloseButton.Size = new System.Drawing.Size(26, 23);
            this.CloseButton.TabIndex = 3;
            this.CloseButton.TabStop = false;
            this.CloseButton.UseVisualStyleBackColor = true;
            // 
            // MaximizeButton
            // 
            //this.MaximizeButton.BackColor = System.Drawing.Color.Transparent;
            this.MaximizeButton.Dock = System.Windows.Forms.DockStyle.Right;
            this.MaximizeButton.FlatAppearance.BorderColor = System.Drawing.Color.Black;
            this.MaximizeButton.FlatAppearance.BorderSize = 0;
            this.MaximizeButton.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.MaximizeButton.Location = new System.Drawing.Point(148, 0);
            this.MaximizeButton.Name = "MaximizeButton";
            this.MaximizeButton.Size = new System.Drawing.Size(26, 23);
            this.MaximizeButton.TabIndex = 1;
            this.MaximizeButton.TabStop = false;
            this.MaximizeButton.UseVisualStyleBackColor = true;
            // 
            // TitleLabel
            // 
            this.TitleLabel.Anchor = System.Windows.Forms.AnchorStyles.Top;
            this.TitleLabel.BackColor = System.Drawing.Color.Transparent;
            this.TitleLabel.Font = new System.Drawing.Font("Segoe UI", 8.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.TitleLabel.Location = new System.Drawing.Point(0, 0);
            this.TitleLabel.Name = "TitleLabel";
            this.TitleLabel.Size = new System.Drawing.Size(122, 23);
            this.TitleLabel.TabIndex = 4;
            this.TitleLabel.Text = "Title Text";
            this.TitleLabel.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // TitleBarPanel
            // 
            this.Controls.Add(this.IconBox);
            this.Controls.Add(this.TitleLabel);
            this.Controls.Add(this.MinimizeButton);
            this.Controls.Add(this.MaximizeButton);
            this.Controls.Add(this.CloseButton);
            this.Dock = System.Windows.Forms.DockStyle.Top;
            this.Size = new System.Drawing.Size(200, 23);
            ((System.ComponentModel.ISupportInitialize)(this.IconBox)).EndInit();
            this.ResumeLayout(false);

        }

        private System.Windows.Forms.Button CloseButton;
        private System.Windows.Forms.Button MaximizeButton;
        private System.Windows.Forms.Button MinimizeButton;
        private System.Windows.Forms.PictureBox IconBox;
        private System.Windows.Forms.Label TitleLabel;

    }
}

